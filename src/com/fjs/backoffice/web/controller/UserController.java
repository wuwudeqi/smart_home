package com.fjs.backoffice.web.controller;


import com.fjs.backoffice.model.User;
import com.fjs.backoffice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * app登录/注册，访问数据模块
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册模块
     * @param username
     * @param password
     * @param email
     * @param phone
     * @return
     */
    @RequestMapping("register")
    public String register(String username,String password,String email,String phone){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);

        userService.register(user);
        return "/user/list";
    }
}
