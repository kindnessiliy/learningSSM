package com.springtry.service.impl;

import com.springtry.dao.SmallStoreDao;
import com.springtry.domain.User;
import com.springtry.service.SmallStoreServ;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-23-18:02
 * @email:1269231889@qq.com
 */
public class SmallStoreServImpl implements SmallStoreServ {
    @Autowired
    private SmallStoreDao smallStoreDao;
    @Override
    public List<User> getUserList() {
        return smallStoreDao.getUserList();
    }

    @Override
    public String kind() {
        return smallStoreDao.whatKind();
    }

    @Override
    public String getAddress(String username) {
        return smallStoreDao.getAddressByUserName(username);
    }
}
