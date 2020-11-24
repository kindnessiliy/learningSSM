package com.controller.controller;/*
    @author:zyh
    @Time:2020-11-11-23:20
    
    */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
    @RequestMapping("/quick")
    public String save(){
        System.out.println("controller save...");
        return "/jsp/success.jsp";//代表从当前应用下查询
    }
    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/jsp/success.jsp");
        modelAndView.addObject("username","root");
        return modelAndView;
    }
}
