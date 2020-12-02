package com.learning.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author:zyh
 * @Time:2020-11-23-20:01
 * @email:1269231889@qq.com
 */
public class UserControllerTest {
    @Autowired
    private UserController controller;
    @Test
    public void test1() {
        controller.test();
    }
}