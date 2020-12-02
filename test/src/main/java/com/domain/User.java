package com.domain;/*
    @author:zyh
    @Time:2020-11-13-12:49
    
    */



public class User{
    private String username;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.username = name;
        this.age = age;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
