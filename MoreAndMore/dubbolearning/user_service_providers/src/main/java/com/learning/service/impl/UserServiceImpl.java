package com.learning.service.impl;

import org.example.bean.User;
import org.example.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-04-14:30
 * @email:1269231889@qq.com
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserList(String userId) {
        User zyh = new User(1, "zyh", "8581");
        User user = new User(2, "sadf", "asdf");
        return Arrays.asList(zyh,user);
    }
}
