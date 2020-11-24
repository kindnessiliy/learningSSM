package com.mybatis.service.impl;

import com.mybatis.domain.Order;
import com.mybatis.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-18-10:44
 * @email:1269231889@qq.com
 */
public class OrderTest {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = mapper.find();
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
