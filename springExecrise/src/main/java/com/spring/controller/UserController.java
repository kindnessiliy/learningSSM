package com.spring.controller;/*
    @author:zyh
    @Time:2020-11-15-17:17
    @email:1269231889@qq.com   
*/

import com.spring.domain.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public ModelAndView list(){
        List<User> users = userService.list();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList",users);
        modelAndView.setViewName("user_list");
        return modelAndView;
    }
}
