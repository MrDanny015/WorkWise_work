package com.user.demo.controlller;

import com.msgbean.Receipt;
import com.user.demo.bean.User;
import com.user.demo.service.UserService;
import com.utils.MD5Util;
import com.utils.VerifyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.PrintWriter;

/**
 * @author 丹尼 用户模块 控制层
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;


    /**
     * 用户登出
     */
    @RequestMapping("loginout")
    @ResponseBody
    public void loginout(){
        User user = (User) request.getSession().getAttribute("user");
        //更改该用户状态为离线
        userService.updateleftstuatsloginout(user.getUid());
        System.out.println("用户："+user.getUname()+"已注销");
        request.getSession().invalidate();

    }

    /**
     * 验证码模块
     *
     * @param response
     * @throws Exception
     */
    @RequestMapping("codeload")
    @ResponseBody
    public void codeload(HttpServletResponse response) throws Exception {
        VerifyCode code = new VerifyCode();
        BufferedImage image = code.createImage();
        request.getSession().setAttribute("code", code.getText());
        VerifyCode.output(image, response.getOutputStream());
    }

    /**
     * 登陆
     *
     * @param username
     * @param userpwd
     * @return
     */
    @RequestMapping("loginis")
    @ResponseBody
    public Receipt loginis(String username, String userpwd) {
        Receipt receipt = userService.loginis(username, userpwd);
        return receipt;
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @RequestMapping("registeris")
    @ResponseBody
    public Receipt registeris(User user) {
        System.out.println(user);
        //实例化回执对象
        Receipt receipt = new Receipt();
        if (user.getUsername()!=null && user.getUserpwd()!=null ){
            try {
                userService.registered(user);
                receipt.setFlag(true);
            } catch (Exception e) {
                e.printStackTrace();
                receipt.setFlag(false);
                receipt.setMsg("注册失败，请重新输入");
            }
        }else {
            receipt.setMsg("用户名或密码不能为空，请重新输入");
        }

        return receipt;
    }

    /**
     * 用户名判断是否存在
     *
     * @param username
     * @return
     */
    @RequestMapping("ifusername")
    @ResponseBody
    public Boolean ifusername(String username) {
        User user = userService.usernameis(username);
        if (user == null && !"".equals(username)) {
            return true;
        } else {
            return false;
        }
    }


}
