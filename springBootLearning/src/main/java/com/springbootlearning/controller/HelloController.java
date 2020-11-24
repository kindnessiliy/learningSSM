package com.springbootlearning.controller;

import com.springbootlearning.pojo.Bank;
import com.springbootlearning.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author:zyh
 * @Time:2020-11-21-12:58
 * @email:1269231889@qq.com
 */
//所有方法的返回值都转换为字符串
@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private BankService service;
//    @Value("${kindnesslily.url}")
//    private String url;
//    @GetMapping("hello")
//    public String hello(@RequestParam String username) throws SQLException {
//        System.out.println(dataSource);
//        System.out.println(username);
//        return "hello,Spring Boot";
//    };
    @GetMapping("/bank/{username}")
    public Bank queryByName(@PathVariable String username){
        return service.findByName(username);
    }

}
