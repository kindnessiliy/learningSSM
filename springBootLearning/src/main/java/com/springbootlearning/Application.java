package com.springbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author:zyh
 * @Time:2020-11-21-12:56
 * @email:1269231889@qq.com
 */
//sprinBoot工程都有一个启动引导类，这是工程的入口类，在引导类上添加@SpringBootApplication
@SpringBootApplication
//@MapperScan ( basePackages = "com.springbootlearning.mapper" )//扫描没有mybatis的mapper接口
@MapperScan(basePackages = "com.springbootlearning.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
