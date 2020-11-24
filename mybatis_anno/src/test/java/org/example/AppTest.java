package org.example;

import static org.junit.Assert.assertTrue;

import com.mybatis_anno.domain.User;
import com.mybatis_anno.mapper.UserMapper;
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
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private UserMapper mapper;
   @Before
    public void before() throws IOException {
       InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfiguration.xml");
       SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
       SqlSession sqlSession = build.openSession(true);
       mapper = sqlSession.getMapper(UserMapper.class);
   }
   @Test
    public void test(){
       User user = new User();
       List<User> all = mapper.findAll();
       for (User user1 : all) {
           System.out.println(user1);
       }
   }
   @Test
    public void testId(){
       User byId = mapper.findById(1);
       System.out.println(byId);
   }

}
