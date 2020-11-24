package org.example.jdk.proxy.impl;/*
    @author:zyh
    @Time:2020-11-08-15:35
    
    */

import org.example.jdk.proxy.TargetInter;

public class Target implements TargetInter {
    @Override
    public void save() {
        System.out.println("save...");
    }
}
