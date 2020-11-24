package org.example.aop;/*
    @author:zyh
    @Time:2020-11-08-15:35
    
    */

public class Target implements TargetInter {
    @Override
    public void save() {

        System.out.println("save...");
    }
}
