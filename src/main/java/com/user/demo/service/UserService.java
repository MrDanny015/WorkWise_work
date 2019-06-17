package com.user.demo.service;

import com.msgbean.Receipt;
import com.user.demo.bean.User;

import java.util.List;

/**
 * @author 丹尼 用户模块 业务接口
 */
public interface UserService {
    /**+
     * 登陆 用户名判断
     * @param username
     * @return
     */
    User usernameis(String username);

    /**
     * 登陆
     * @param username
     * @param userpwd
     * @param
     * @return
     */
    Receipt loginis(String username, String userpwd);

    /**
     * 注册 添加用户
     * @param user
     * @throws Exception
     */
    void registered(User user) throws Exception;

    /**
     * 人气榜查询
     * @return
     */
    List<User> selectHosts();

    /**
     * 用户在线状态更改
     */
    void updateleftstuatslogin(Integer uid);

    /**
     * 用户离线状态更改
     */
    void updateleftstuatsloginout(Integer uid);

}
