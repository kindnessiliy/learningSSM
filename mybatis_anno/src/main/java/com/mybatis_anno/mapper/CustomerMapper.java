package com.mybatis_anno.mapper;

import com.mybatis_anno.domain.Customer;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-19-14:23
 * @email:1269231889@qq.com
 */
public interface CustomerMapper {
    @Select("select * from customers")
    @Results({
            @Result(id = true,column = "customer_id", property = "customer_id"),//id代表为主键
            @Result(column = "first_name", property = "first_name"),
            @Result(column = "last_name", property = "last_name"),
            @Result(
                    property = "orderList",
                    column = "customer_id",
                    javaType = List.class,
                    many = @Many(select = "com.mybatis_anno.mapper.OrderMapper.findById")
            )
    })
    List<Customer> findOrderAll();
}
