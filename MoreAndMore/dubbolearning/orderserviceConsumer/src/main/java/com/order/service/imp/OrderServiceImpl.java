package com.order.service.imp;

import org.example.bean.User;
import org.example.service.OrderService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-04-14:29
 * @email:1269231889@qq.com
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserService userService;
    @Override
    public List<User> initOrder(String userId) {
        List<User> userList = userService.getUserList(userId);
        System.out.println(userList);
        return null;
    }
}
