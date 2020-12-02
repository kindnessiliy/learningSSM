package com.spring.dao.impl;/*
    @author:zyh
    @Time:2020-11-15-17:23
    @email:1269231889@qq.com   
*/

import com.spring.dao.UserDao;
import com.spring.domain.Role;
import com.spring.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        List<User> query = jdbcTemplate.query("select * from user where", new BeanPropertyRowMapper<User>(User.class));
        return query;
    }

}
