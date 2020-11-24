package org.example.anno_aop;/*
    @author:zyh
    @Time:2020-11-08-19:56
    
    */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect//标志切面类
public class MyAspect {
    @Before("MyAspect.pointcut()")
    public void before(){
        System.out.println("before....");
    }

    public void afterReturning(){
        System.out.println("after...");
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around...");
        Object proceed = point.proceed();
        System.out.println("after around...");
        return proceed;
    }
    public void throwReturning(){
        System.out.println("exception....");
    }
    @Pointcut("execution(* org.example.anno_aop.Target.*(..))")
    public void pointcut(){}//空实现
}
