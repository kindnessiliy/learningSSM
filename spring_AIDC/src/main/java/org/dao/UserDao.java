package org.dao;/*
    @author:zyh
    @Time:2020-11-09-20:02
    
    */

public interface UserDao {
    void out(int money,String outMan);
    void in(int money,String inMan);
}
