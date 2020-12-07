package org.example.bean;

import java.io.Serializable;

/**
 * @author:zyh
 * @Time:2020-12-04-14:12
 * @email:1269231889@qq.com
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public User() {
        super();
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
