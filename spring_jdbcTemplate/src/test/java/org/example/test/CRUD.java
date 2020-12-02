package org.example.test;/*
    @author:zyh
    @Time:2020-11-09-18:32
    
    */

import org.example.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationJdbc.xml")
public class CRUD {
    @Autowired
    private JdbcTemplate jd;
    @Test
    public void testUpdate(){
        jd.update("update user set password=? where id=?","6532",2);
    }
    @Test
    public void testDelete(){
        int update = jd.update("delete from user where id=?", 3);
        System.out.println(update);
    }
    @Test
    public void testQueryAll(){
        List<User> query = jd.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        for (User user : query) {
            System.out.println(user);
        }
    }
    @Test
    public void testQueryOne(){
        User zyh = jd.queryForObject("select * from user where username= ?", new BeanPropertyRowMapper<User>(User.class), "zy");
        System.out.println(zyh);
    }
    @Test
    public void testQueryCount(){
        Long aLong = jd.queryForObject("select count(username) from user", Long.class);
        System.out.println(aLong);
    }
}
