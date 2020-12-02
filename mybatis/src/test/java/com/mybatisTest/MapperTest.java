package com.mybatisTest;/*
    @author:zyh
    @Time:2020-11-16-21:30
    @email:1269231889@qq.com   
*/

import com.mybatis.mapper.UserMapper;
import com.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class MapperTest {
    @Test
    public void findByCondition() throws IOException {
        User user = new User();
        user.setId(1);
        user.setUsername("zs");
        user.setPassword("59sdf");
        user.setBirthday(new Date());
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findId(1));
    }
}
