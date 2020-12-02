package com.mybatisTest;/*
    @author:zyh
    @Time:2020-11-16-19:06
    @email:1269231889@qq.com   
*/

import com.mybatis.domain.User;
import com.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void show() throws IOException {
        //获得配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        //获取sqlSession工厂对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得回话对象session
        SqlSession sqlSession = build.openSession();
        //执行操作 参数：namespace+id
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.findAll();
        System.out.println(all);
    }
    @Test
    public void insert() throws IOException {
        //模拟user对象
        User kindnesslily = new User( "kindnesslily", "7329");
        //获得配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        //获取sqlSession工厂对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得回话对象session
        SqlSession sqlSession = build.openSession(true);
        //执行操作 参数：namespace+id，插入的话有事务，mybatis执行更新操作，需要提交事务
        int insert = sqlSession.insert("userMapper.save",kindnesslily);
        System.out.println(insert);
        sqlSession.close();
    }
    @Test
    public void delete() throws IOException {
        //模拟user对象
        //获得配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        //获取sqlSession工厂对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得回话对象session
        SqlSession sqlSession = build.openSession();
        //执行操作 参数：namespace+id，插入的话有事务，mybatis执行更新操作，需要提交事务
        sqlSession.delete("userMapper.delete",1);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void update() throws IOException {
        //模拟user对象
        User user = new User(6, "lonely", "800165");
        //获得配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        //获取sqlSession工厂对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得回话对象session
        SqlSession sqlSession = build.openSession();
        //执行操作 参数：namespace+id，插入的话有事务，mybatis执行更新操作，需要提交事务
        sqlSession.update("userMapper.update",user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void showId() throws IOException {
        //获得配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        //获取sqlSession工厂对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得回话对象session
        SqlSession sqlSession = build.openSession();
        //执行操作 参数：namespace+id
        System.out.println(sqlSession.selectOne("userMapper.findId", 2));
        sqlSession.close();
    }
}
