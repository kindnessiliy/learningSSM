package org.example.cglib;/*
    @author:zyh
    @Time:2020-11-08-15:35
    
    */

public class Advice {
    public void before(){
        System.out.println("before...");
    }
    public void after(){
        System.out.println("after....");
    }
}
