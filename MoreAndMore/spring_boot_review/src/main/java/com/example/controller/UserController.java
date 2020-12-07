package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:zyh
 * @Time:2020-12-07-18:12
 * @email:1269231889@qq.com
 */
@RestController
@Api
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "通过id查找")
    @GetMapping("/findById")
    public User findId(@RequestParam Integer id) {
        return userService.findById(id);
    }

    @ApiOperation(value = "查找全部")
    @GetMapping("/all")
    public List<User> all() {
        return userService.findAll();
    }

    @ApiOperation(value = "插入")
    @GetMapping("/insert")
    public Integer insertUser(@RequestParam(value = "name") String username,@RequestParam String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userService.insertUser(user);
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
