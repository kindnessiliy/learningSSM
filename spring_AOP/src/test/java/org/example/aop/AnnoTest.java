package org.example.aop;/*
    @author:zyh
    @Time:2020-11-08-21:48
    
    */

import org.aspectj.lang.annotation.Aspect;
import org.example.anno_aop.Target;
import org.example.anno_aop.TargetInter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_anno.xml")
public class AnnoTest {
    @Autowired
    private TargetInter target;
    @Test
    public void test(){
        target.save();
    }
}
