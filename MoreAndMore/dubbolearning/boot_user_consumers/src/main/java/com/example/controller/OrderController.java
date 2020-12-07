package com.example.controller;

import org.example.bean.User;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-04-15:57
 * @email:1269231889@qq.com
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/init")
    public List<User> initOrder(@RequestParam String userId){
        List<User> users = orderService.initOrder(userId);
        return users;
    }
}
