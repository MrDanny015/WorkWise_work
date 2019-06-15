package com.user.demo.service;

import com.msgbean.Receipt;
import com.user.demo.bean.User;

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
     * @param code
     * @return
     */
    Receipt loginis(String username, String userpwd);

    /**
     * 注册 添加用户
     * @param user
     * @throws Exception
     */
    void registered(User user) throws Exception;

}
