package com.springtry.dao;

import com.springtry.domain.User;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-23-17:45
 * @email:1269231889@qq.com
 */
public interface SmallStoreDao {
    List<User> getUserList();
    String whatKind();
    String getAddressByUserName(String username);
}
