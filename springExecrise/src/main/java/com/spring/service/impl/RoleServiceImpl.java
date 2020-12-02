package com.spring.service.impl;/*
    @author:zyh
    @Time:2020-11-15-16:25
    
    */

import com.spring.dao.RoleDao;
import com.spring.domain.Role;
import com.spring.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> list() {
        List<Role> roles = roleDao.findAll();
        return roles;
    }

    @Override
    public void save(Role role) {
        roleDao.save(role);
    }


}
