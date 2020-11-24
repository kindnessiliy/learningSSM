package com.spring.service.impl;/*
    @author:zyh
    @Time:2020-11-15-17:21
    @email:1269231889@qq.com   
*/

import com.spring.dao.RoleDao;
import com.spring.dao.UserDao;
import com.spring.domain.Role;
import com.spring.domain.User;
import com.spring.service.UserService;

import java.util.List;

public class UserServiceIml implements UserService {
    private UserDao userDao;
    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userlist中user的roles数据
        for (User user : userList) {
            Long id = user.getId();
            List<Role> roles = roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }
}
