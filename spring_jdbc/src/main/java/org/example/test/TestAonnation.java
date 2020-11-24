package org.example.test;/*
    @author:zyh
    @Time:2020-11-07-23:29
    
    */

import org.example.config.SpringConfiguration;
import org.example.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAonnation {
    @Test
    public void test(){
        //ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserServiceImpl bean = annotationConfigApplicationContext.getBean(UserServiceImpl.class);
        bean.save();
    }
}
