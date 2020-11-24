package com.spring.dao;
/*
    @author:zyh
    @Time:2020-11-15-16:26
    
    */

import com.spring.domain.Role;

import java.util.List;

public interface RoleDao {
    List<Role> findAll();
    void save(Role role);
    List<Role> findRoleByUserId(Long id);
}
