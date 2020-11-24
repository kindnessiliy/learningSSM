package com.mybatis.mapper;

import com.mybatis.domain.Customer;
import com.mybatis.domain.Order;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-18-10:26
 * @email:1269231889@qq.com
 */
public interface CustomerMapper {
    List<Customer> find();
}
