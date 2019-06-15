package com.user.demo.service.impl;

import com.msgbean.Receipt;
import com.user.demo.bean.User;
import com.user.demo.bean.UserExample;
import com.user.demo.dao.UserMapper;
import com.user.demo.service.UserService;
import com.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 丹尼 用户模块 业务实现
 */
@Service
public class UserServieImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HttpServletRequest request;


    /**
     * 登陆 用户名验证
     *
     * @param username
     * @return
     */
    @Override
    public User usernameis(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (users != null && users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    /**
     * 登陆校验
     * @param username
     * @param userpwd
     * @return
     */
    @Override
    public Receipt loginis(String username, String userpwd) {
        //实例化回执对象
        Receipt receipt = new Receipt();
            //根据用户名查询数据库
            User user = usernameis(username);
            //判断用户名是否正确
            if (user != null) {
                //MD5加密
                String pwssword = MD5Util.mysqlMd5(userpwd);
                //判断密码是否正确
                if (user.getUserpwd().equals(pwssword)) {
                    //判断用户是否激活或者为管理员
                    if (user.getStauts().equals(1) || user.getStauts().equals(2)) {
                        receipt.setCode(10001);
                        //将用户信息存入session
                        HttpSession session = request.getSession();
                        System.out.println("用户："+user.getUname()+"已登陆");
                        session.setAttribute("user", user);
                    } else {
                        receipt.setCode(10002);
                        receipt.setMsg("用户未激活，请联系客服激活账号");
                    }
                } else {
                    receipt.setCode(10003);
                    receipt.setMsg("密码错误，请重新登陆");
                }
            } else {
                receipt.setCode(10004);
                receipt.setMsg("用户名不存在，请重新登陆");
            }
        return receipt;
    }


    /**
     * 注册 添加用户
     *
     * @param user
     * @throws Exception
     */
    @Override
    public void registered(User user) throws Exception {
        //MD5加密
        user.setUserpwd(MD5Util.mysqlMd5(user.getUserpwd()));
        //初始化粉丝量
        user.setFans(0);
        //初始化关注量
        user.setAttention(0);
        //初始化阅读量
        user.setViewcount(0);
        //初始化身份
        user.setSignature("菜鸟");
        //初始化状态
        user.setLeftstauts(0);
        userMapper.insert(user);
    }

}
