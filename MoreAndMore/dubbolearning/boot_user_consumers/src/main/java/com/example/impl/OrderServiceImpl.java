package com.example.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.example.bean.User;
import org.example.service.OrderService;
import org.example.service.UserService;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-04-14:29
 * @email:1269231889@qq.com
 */
@Service

public class OrderServiceImpl implements OrderService {
    @Reference
    private UserService userService;
    @Override
    public List<User> initOrder(String userId) {
        List<User> userList = userService.getUserList(userId);
        System.out.println(userList);
        return userList;
    }
}
