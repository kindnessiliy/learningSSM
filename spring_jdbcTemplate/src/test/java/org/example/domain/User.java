package org.example.domain;/*
    @author:zyh
    @Time:2020-11-08-22:35
    
    */

public class User {
    private String username;
    private int password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
