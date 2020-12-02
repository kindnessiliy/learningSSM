package com.learning.controller;/*
    @author:zyh
    @Time:2020-11-14-21:23
    
    */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TargetController {
    @RequestMapping("/target")
    public ModelAndView show(){
        System.out.println("show..");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","zyh learning springmvc");
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }
}