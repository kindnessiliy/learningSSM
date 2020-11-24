package org.service.impl;/*
    @author:zyh
    @Time:2020-11-09-20:07
    
    */

import org.aspectj.lang.annotation.Pointcut;
import org.dao.impl.UserDaoImpl;
import org.domain.User;
import org.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDaoImpl userDao;
    private BeanFactory beanFactory;
    @Override
    @Transactional
    public void transfer(String outMan, String inMan, int money) {
        userDao.out(money, outMan);
        userDao.in(money, inMan);
    }
}
