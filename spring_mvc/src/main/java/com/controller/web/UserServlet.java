package com.controller.web;/*
    @author:zyh
    @Time:2020-11-11-9:48
    
    */

import com.controller.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        ApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService bean = webApplicationContext.getBean(UserService.class);
        bean.save();
    }
}
