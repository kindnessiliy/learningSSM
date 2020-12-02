package org.example.test;/*
    @author:zyh
    @Time:2020-11-08-13:35
    
    */

import com.alibaba.druid.pool.DruidDataSource;
import org.example.config.SpringConfiguration;
import org.example.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
@PropertySource("classpath:jdbc.properties")
public class SpringJunitTest {
    @Value("${driverClassName}")
    private String driverClassName;
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String userName;
    @Value("${password}")
    private String password;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    @Qualifier("dataSource")
    private DruidDataSource db;
    @Test
    public void test(){
        userService.save();
    }
    @Test
    public void test2() throws SQLException {
        System.out.println(db.getConnection());
    }
    @Test
    public void test4(){
        System.out.println(driverClassName);
        System.out.println(userName);
        System.out.println(url);
        System.out.println(password);
    }
    @Test
    public void test3() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(password);
        System.out.println(druidDataSource.getConnection());
    }

}
