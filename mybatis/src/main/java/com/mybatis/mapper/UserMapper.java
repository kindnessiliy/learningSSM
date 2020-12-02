package com.mybatis.mapper;/*
    @author:zyh
    @Time:2020-11-16-20:52
    @email:1269231889@qq.com   
*/

import com.mybatis.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {
    public List<User> findAll() throws IOException;
    User findId(int id);
    List<User> findByCondition(User user);
    void saveBirthDay(User user);
    List<User> findById(User user);
    List<User> forEach(List<Integer> list);
}
