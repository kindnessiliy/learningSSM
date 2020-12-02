package com.spring.dao.impl;/*
    @author:zyh
    @Time:2020-11-15-16:27
    
    */

import com.spring.dao.RoleDao;
import com.spring.domain.Role;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RoleDaoImpl implements RoleDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Role> findAll() {
        List<Role> query = jdbcTemplate.
                query("select * from role", new BeanPropertyRowMapper<Role>(Role.class));
        return query;
    }

    @Override
    public void save(Role role) {
        jdbcTemplate.update("insert into role values(?,?,?)",null,role.getRoleName(),role.getRoleDesc());
    }

    @Override
    public List<Role> findRoleByUserId(Long id) {
        List<Role> roles = jdbcTemplate.
                query("select * from usr_role ur,role r where ur.roleId=r.id and ur.userId=?", new BeanPropertyRowMapper<Role>(Role.class));
        return roles;
    }

}
