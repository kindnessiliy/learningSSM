package com.providers.service;

import com.dubboInterface.domain.User;
import com.dubboInterface.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-07-18:51
 * @email:1269231889@qq.com
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUserList(String userId) {
        User user = new User();
        user.setUsername("845");
        user.setPassword("7841");
        User user1 = new User();
        user1.setUsername("848");
        user1.setPassword("848");
        return Arrays.asList(user,user1);
    }
}
