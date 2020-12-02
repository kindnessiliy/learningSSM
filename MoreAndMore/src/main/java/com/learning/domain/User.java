package com.learning.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author:zyh
 * @Time:2020-11-22-19:56
 * @email:1269231889@qq.com
 */
@Data
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)

public class User {
    @Id
    private Integer id;
    private String username;
    private String password;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
