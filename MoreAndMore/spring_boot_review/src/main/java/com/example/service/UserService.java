package com.example.service;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-07-18:08
 * @email:1269231889@qq.com
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User findById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public List<User> findAll() {
        return userMapper.selectAll();
    }
    @Transactional
    public Integer insertUser(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }
}
