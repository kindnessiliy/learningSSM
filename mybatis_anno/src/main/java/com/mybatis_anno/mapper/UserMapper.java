package com.mybatis_anno.mapper;/*
    @author:zyh
    @Time:2020-11-16-20:52
    @email:1269231889@qq.com   
*/

import com.mybatis_anno.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.IOException;
import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
    @Delete("delete from user where id=#{id}")
    void delete(int id);
    @Select("select * from user where id=#{id}")
    User findById(int id);
    @Insert("insert into user values (#{id},#{username},#{password})")
    void insertTo(User user);
}
