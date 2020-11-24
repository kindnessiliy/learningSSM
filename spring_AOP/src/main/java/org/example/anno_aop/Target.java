package org.example.anno_aop;/*
    @author:zyh
    @Time:2020-11-08-15:35
    
    */

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TargetInter {
    @Override
    public void save() {
        System.out.println("save...");
    }
}
