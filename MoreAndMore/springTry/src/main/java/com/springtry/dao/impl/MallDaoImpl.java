package com.springtry.dao.impl;

import com.springtry.dao.MallDao;
import com.springtry.domain.Mall;
import com.springtry.domain.SmallStore;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-23-17:45
 * @email:1269231889@qq.com
 */
public class MallDaoImpl implements MallDao {
    @Autowired
    private Mall mall;

    @Override
    public String getStoreNameByAddress(String address) {
        List<SmallStore> smallStore = mall.getSmallStore();
        for (SmallStore store : smallStore) {
            if(store.getAddress().equals(address)){
                return store.getStoreName();
            }
        }
        return "sorry";
    }

    @Override
    public String getMallAddress() {
        return mall.getMallName();
    }
}
