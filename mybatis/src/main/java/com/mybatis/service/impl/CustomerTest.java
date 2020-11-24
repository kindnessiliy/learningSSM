package com.mybatis.service.impl;

import com.mybatis.domain.Customer;
import com.mybatis.domain.Order;
import com.mybatis.mapper.CustomerMapper;
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
 * @Time:2020-11-18-12:01
 * @email:1269231889@qq.com
 */
public class CustomerTest {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customers = mapper.find();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
