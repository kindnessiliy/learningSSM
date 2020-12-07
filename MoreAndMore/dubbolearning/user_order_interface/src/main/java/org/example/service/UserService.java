package org.example.service;

import org.example.bean.User;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-04-14:14
 * @email:1269231889@qq.com
 */
public interface UserService {
    List<User> getUserList(String userId);
}
