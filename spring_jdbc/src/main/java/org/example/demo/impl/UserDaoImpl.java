package org.example.demo.impl;/*
    @author:zyh
    @Time:2020-11-07-22:33
    
    */

import org.example.demo.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("userDao save");
    }
}
