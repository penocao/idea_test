package com.exodus.web.controller;

import com.exodus.pojo.User;
import com.exodus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: soushihou
 * @Date: 2020/2/8
 * @Description: com.exodus.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user){
        this.userService.addUser(user);
        return "ok";
    }
}
