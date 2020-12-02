package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author:zyh
 * @Time:2020-11-22-19:54
 * @email:1269231889@qq.com
 */
@SpringBootApplication
@MapperScan(basePackages = "com.learning.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
