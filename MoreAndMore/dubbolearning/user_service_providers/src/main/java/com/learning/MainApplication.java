package com.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author:zyh
 * @Time:2020-12-04-14:55
 * @email:1269231889@qq.com
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("providers.xml");
        context.start();
        System.in.read();
    }
}
