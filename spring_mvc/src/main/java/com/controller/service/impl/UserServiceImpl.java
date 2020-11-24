package com.controller.service.impl;/*
    @author:zyh
    @Time:2020-11-11-9:44
    
    */

import com.controller.dao.UserDao;
import com.controller.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
