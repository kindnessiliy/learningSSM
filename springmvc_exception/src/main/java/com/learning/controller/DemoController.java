package com.learning.controller;/*
    @author:zyh
    @Time:2020-11-14-23:01
    
    */

import com.learning.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;
    @RequestMapping("/show")
    public String show(@RequestParam(value = "name",required = true) String name){
        System.out.println("show running....");
        demoService.show1();
        return "index.jsp";
    }
}
