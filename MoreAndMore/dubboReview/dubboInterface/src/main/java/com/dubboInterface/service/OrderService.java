package com.dubboInterface.service;

import com.dubboInterface.domain.User;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-07-18:48
 * @email:1269231889@qq.com
 */
public interface OrderService {
    List<User> initOrder(String userId);
}
