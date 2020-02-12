package com.wc.controller;

import com.wc.domain.User;
import com.wc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 汪诚
 * @Date: 2020/2/3 17:16
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@ModelAttribute User user, Model model) throws Exception {
        User u = userService.login(user);
        System.out.println(u);
        if(u != null){
            return "success";
        }
        model.addAttribute("false","登录失败");
        return "login";
    }


    }
