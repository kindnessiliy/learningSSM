package com.springtry.dao;

/**
 * @author:zyh
 * @Time:2020-11-23-17:44
 * @email:1269231889@qq.com
 */
public interface MallDao {
    String getStoreNameByAddress(String address);
    String getMallAddress();
}
