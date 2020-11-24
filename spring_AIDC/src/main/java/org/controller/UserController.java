package org.controller;/*
    @author:zyh
    @Time:2020-11-09-20:40
    
    */

import org.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext cl = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = cl.getBean(UserService.class);
        bean.transfer("zyh","yixian",1000);
    }
}
