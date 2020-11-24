package org.example.aop;/*
    @author:zyh
    @Time:2020-11-08-19:56
    
    */

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("before....");
    }
    public void afterReturning(){
        System.out.println("after...");
    }

    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around...");
        Object proceed = point.proceed();
        System.out.println("after around...");
        return proceed;
    }
    public void throwReturning(){
        System.out.println("exception....");
    }
}
