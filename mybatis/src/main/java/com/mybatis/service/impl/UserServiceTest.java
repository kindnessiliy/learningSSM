package com.mybatis.service.impl;/*
    @author:zyh
    @Time:2020-11-16-21:02
    @email:1269231889@qq.com   
*/

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.mapper.UserMapper;
import com.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserServiceTest {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //设置分页相关参数  当前页和每页显示的条数
        PageHelper.startPage(2,2);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        PageInfo<User> pageInfo = new PageInfo<User>(all);
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPageSize());
        System.out.println(pageInfo.getSize());
        sqlSession.close();
    }
}
