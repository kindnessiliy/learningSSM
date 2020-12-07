package com.consumers.service;

import com.dubboInterface.domain.User;
import com.dubboInterface.service.OrderService;
import com.dubboInterface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-07-19:03
 * @email:1269231889@qq.com
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserService userService;
    @Override
    public List<User> initOrder(String userId) {
        List<User> userList = userService.getUserList("1");
        return userList;
    }
}
