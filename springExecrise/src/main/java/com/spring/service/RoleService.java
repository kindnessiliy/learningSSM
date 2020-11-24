package com.spring.service;/*
    @author:zyh
    @Time:2020-11-15-16:24
    
    */

import com.spring.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> list();
    void save(Role role);

}
