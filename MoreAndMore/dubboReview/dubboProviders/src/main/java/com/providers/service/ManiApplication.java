package com.providers.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author:zyh
 * @Time:2020-12-07-18:58
 * @email:1269231889@qq.com
 */
public class ManiApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("providers.xml");
        context.start();
        System.in.read();
    }
}
