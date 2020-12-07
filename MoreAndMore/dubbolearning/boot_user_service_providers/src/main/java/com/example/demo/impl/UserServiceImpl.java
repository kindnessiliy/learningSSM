package com.example.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.example.bean.User;
import org.example.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-04-14:30
 * @email:1269231889@qq.com
 */
@Service//暴露服务
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserList(String userId) {
        User zyh = new User(1, "zyh", "8581");
        User user = new User(2, "sadf", "asdf");
        return Arrays.asList(zyh,user);
    }
}
