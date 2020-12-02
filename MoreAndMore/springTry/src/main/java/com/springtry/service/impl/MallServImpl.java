package com.springtry.service.impl;

import com.springtry.dao.MallDao;
import com.springtry.service.MallServ;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author:zyh
 * @Time:2020-11-23-18:02
 * @email:1269231889@qq.com
 */
public class MallServImpl implements MallServ {
    @Autowired
    private MallDao mallDao;

    @Override
    public String getStoreName(String address) {
        String storeNameByAddress = mallDao.getStoreNameByAddress(address);
        return storeNameByAddress;
    }

    @Override
    public String getMallAddress() {
        return mallDao.getMallAddress();
    }
}
