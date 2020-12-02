package org.example.test;/*
    @author:zyh
    @Time:2020-11-08-22:37
    
    */

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {


    @Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new
                ClassPathXmlApplicationContext("applicationJdbc.xml");
        JdbcTemplate bean = classPathXmlApplicationContext.getBean(JdbcTemplate.class);
        int jerry = bean.update("delete from user where id = 5");
        System.out.println(jerry);
    }
}
