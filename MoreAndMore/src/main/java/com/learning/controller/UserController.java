package com.learning.controller;

import com.learning.domain.User;
import com.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author:zyh
 * @Time:2020-11-22-19:55
 * @email:1269231889@qq.com
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/userName/{name}")
    public String show(@PathVariable String name){
        User byId = userService.findByName(name);
        return byId.toString();
    }
    @GetMapping("/userId/{id}")
    public String showById(@PathVariable Integer id){
        return userService.findById(id).toString();
    }
    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "ok";
    }
    @ResponseBody
    @GetMapping("/user/save")
    public String save(@RequestParam String name,@RequestParam String password){
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        String s = userService.saveUser(user);
        return s;
    }
    @ResponseBody
    @RequestMapping(value = "/user/input",produces = "text/html;charset=UTF-8",method = RequestMethod.POST)
    public void inputSave(User user){
        userService.saveUser(user);
    }

}
