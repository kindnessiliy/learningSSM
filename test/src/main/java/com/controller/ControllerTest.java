package com.controller;/*
    @author:zyh
    @Time:2020-11-12-22:53
    
    */

import com.domain.User;
import com.domain.VO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
public class ControllerTest {
    @RequestMapping("/test")
    public String save() {
        System.out.println("test save..");
        return "success.jsp";
    }

    @RequestMapping("/quick")
    public void test(HttpServletResponse http) throws IOException {
        http.getWriter().println("hello root");
    }

    @ResponseBody
    @RequestMapping("/quick2")
    public String save3(HttpServletResponse http) throws IOException {
        return "hello root";
    }

    @ResponseBody
    @RequestMapping("/quick3")
    public String save4() {
        return "{\"username\":\"root\",\"age\":18}";
    }

    @ResponseBody
    @RequestMapping("/quick5")
    //期望springmvc自动将user转换成json数据
    public User save5() throws JsonProcessingException {
        User user = new User();
        user.setAge(18);
        user.setUsername("zyh");
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/quick6")
    public void get(String username,int age){
        System.out.println(username);
        System.out.println(age);
    }
    @ResponseBody
    @RequestMapping("/quick7")
    public void get2(User user){
        System.out.println(user);
    }

    @ResponseBody
    @RequestMapping("/quick8")
    public void get3(VO vo){
        System.out.println(vo);
    }
    @ResponseBody
    @RequestMapping("/quick9")
    public void get4(@RequestParam(value = "username") String name){
        System.out.println(name);
    }
    @ResponseBody
    @RequestMapping("/quick10/{name} GET")//获取url的数据
    public void get5(@PathVariable(value = "name",required = true) String name){
        System.out.println(name);
    }
    @ResponseBody
    @RequestMapping("/quick11")//验证是否转换成功
    public void get6(Date date){
        System.out.println(date);
    }
    @ResponseBody
    @RequestMapping("/quick12")//获取请求头
    public void get7(@RequestHeader(value = "User-Agent",required = false) String userAgent){
        System.out.println(userAgent);
    }
    @ResponseBody
    @RequestMapping("/quick13")//获得Cookie的名字
    public void get8(@CookieValue(value = "JSESSIONID") String jsessionId){
        System.out.println(jsessionId);
    }
    @ResponseBody
    @RequestMapping("/quick14")
    public void get9(String name, MultipartFile[] upload) throws IOException {
        System.out.println(name);
        for (MultipartFile multipartFile : upload) {
            multipartFile.transferTo(new File("D:\\upload\\"+multipartFile.getOriginalFilename()));
        }
    }
}
