package com.springtry.dao.impl;

import com.springtry.dao.SmallStoreDao;
import com.springtry.domain.SmallStore;
import com.springtry.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-23-17:45
 * @email:1269231889@qq.com
 */
public class SmallStoreDaoImpl implements SmallStoreDao {
    @Autowired
    private SmallStore smallStore;

    @Override
    public List<User> getUserList() {
        return smallStore.getUser();
    }
    @Override
    public String whatKind() {
        return smallStore.getKind();
    }

    @Override
    public String getAddressByUserName(String username) {
        List<User> user = smallStore.getUser();
        for (User user1 : user) {
            if (username.equals(user1.getName())){
                return user1.getAddress();
            }
        }
        return "this user don't have an address";
    }
}
