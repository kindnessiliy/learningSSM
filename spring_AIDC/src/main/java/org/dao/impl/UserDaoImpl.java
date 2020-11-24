package org.dao.impl;/*
    @author:zyh
    @Time:2020-11-09-20:03
    
    */

import org.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jd;

    @Override
    public void out(int money,String outMan) {
        jd.update("update banke set money=money-? where name =?",money,outMan);
    }

    @Override
    public void in(int money,String inMan) {
        jd.update("update banke set money = money+? where name =?",money,inMan);
    }
}
