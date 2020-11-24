package org.example.service.impl;/*
    @author:zyh
    @Time:2020-11-07-22:41
    
    */

import org.example.demo.UserDao;
import org.example.demo.impl.UserDaoImpl;
import org.example.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("userService")
@Repository("userService")
public class UserServiceImpl implements Userservice {
    @Autowired
    @Qualifier("userDao")
    private UserDaoImpl userDao;
    @Value("itcast")
    private String driver;
    @Value("123")
    private int i;
    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void init(){
        System.out.println("init..");
    }
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
        System.out.println(driver);
    }
}
