package com.example.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author:zyh
 * @Time:2020-12-07-18:02
 * @email:1269231889@qq.com
 */
@Data
@Table(name = "user")
@ApiModel(value = "user")
public class User {
    @Id
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "username")
    private String username;
    @ApiModelProperty(value = "password")
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
