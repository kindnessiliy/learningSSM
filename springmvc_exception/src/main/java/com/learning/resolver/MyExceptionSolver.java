package com.learning.resolver;/*
    @author:zyh
    @Time:2020-11-15-10:51
    
    */

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionSolver implements HandlerExceptionResolver {
    @Override
    // 参数Exception，异常对象；返回值：跳转的视图信息
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof ClassCastException){
           modelAndView.setViewName("error2.jsp");
        }
        return modelAndView;
    }
}
