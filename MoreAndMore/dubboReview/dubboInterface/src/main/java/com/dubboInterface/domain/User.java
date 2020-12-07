package com.dubboInterface.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author:zyh
 * @Time:2020-12-07-18:46
 * @email:1269231889@qq.com
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    public User(){
        super();
    }
    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
