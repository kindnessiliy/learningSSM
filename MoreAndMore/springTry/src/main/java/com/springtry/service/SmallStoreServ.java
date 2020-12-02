package com.springtry.service;

import com.springtry.domain.User;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-23-18:00
 * @email:1269231889@qq.com
 */
public interface SmallStoreServ {
    List<User> getUserList();
    String kind();
    String getAddress(String username);
}
