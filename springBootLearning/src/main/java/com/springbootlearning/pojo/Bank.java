package com.springbootlearning.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author:zyh
 * @Time:2020-11-22-15:38
 * @email:1269231889@qq.com
 */
//在编译阶段会根据注解自动生成对应方法，data包括了get/set/hashCode/toString
@Data
@Table(name = "bank")
public class Bank {
    @Id
//    @KeySql(useGeneratedKeys = true)  表明主键回填
    private String name;
    @Column
    private Double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
