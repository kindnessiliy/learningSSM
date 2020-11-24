package com.mybatis_anno.mapper;

import com.mybatis_anno.domain.Order;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-18-23:01
 * @email:1269231889@qq.com
 */
public interface OrderMapper {
    @Select("select * from orders where order_id=#{id}")
    List<Order> findById(int id);
    @Results({
            @Result(column = "order_id",property = "id"),
            @Result(column = "order_date",property = "date"),
            @Result(column = "customer_id",property = "customer.customer_id"),
            @Result(column = "first_name",property = "customer.first_name"),
    })
    @Select("select * from orders o,customers cu where o.customer_id=cu.customer_id")
    List<Order> findAll();

}
