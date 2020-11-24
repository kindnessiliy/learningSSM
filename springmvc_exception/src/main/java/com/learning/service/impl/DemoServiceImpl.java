package com.learning.service.impl;/*
    @author:zyh
    @Time:2020-11-14-22:56
    
    */

import com.learning.service.DemoService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoServiceImpl implements DemoService {
    @Override
    public void show1() {
        System.out.println("转换异常");
        Object str = "adsabs";
        Integer num = (Integer) str;
    }

    @Override
    public void show2() {
        System.out.println("除零异常");
        int i=1/0;
    }

    @Override
    public void show3() {
        System.out.println("空指针异常");
        String param = null;
        System.out.println(param.equals("yes"));
    }

    @Override
    public void show4() throws FileNotFoundException {
        System.out.println("文件不存在");
        FileInputStream fileInputStream = new FileInputStream("C:/xx/xx/xx/x");
    }
}
