package com.learning.service;

import com.learning.domain.User;
import com.learning.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-22-19:56
 * @email:1269231889@qq.com
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> findAll() {
        List<User> users = userMapper.selectAll();
        return users;
    }
    @Transactional
    public String saveUser(User user){
        Integer i = userMapper.insertSelective(user);
        return i.toString();
    }
    public User findById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
    public User findByName(String name){
        return userMapper.selectOneByExample(name);
    }
    @Transactional
    public void deleteById(Integer id){
        userMapper.deleteByPrimaryKey(id);
    }
}
