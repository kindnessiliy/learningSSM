package org.example;

import com.mybatis_anno.domain.Customer;
import com.mybatis_anno.domain.Order;
import com.mybatis_anno.mapper.CustomerMapper;
import com.mybatis_anno.mapper.OrderMapper;
import com.mybatis_anno.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author:zyh
 * @Time:2020-11-18-23:07
 * @email:1269231889@qq.com
 */
public class Test2 {
    private CustomerMapper mapper;
    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        mapper = sqlSession.getMapper(CustomerMapper.class);
    }
    @Test
    public void test1(){

    }
    @Test
    public void test2(){
        List<Customer> orderAll = mapper.findOrderAll();
        for (Customer customer : orderAll) {
            System.out.println(customer);
        }
    }
}
