package com.spring.dao;/*
    @author:zyh
    @Time:2020-11-15-17:23
    @email:1269231889@qq.com   
*/

import com.spring.domain.Role;
import com.spring.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

}
