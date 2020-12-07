package com.consumers;

import com.dubboInterface.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author:zyh
 * @Time:2020-12-07-19:05
 * @email:1269231889@qq.com
 */
public class Consumers {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("consumers.xml");
        OrderService bean = con.getBean(OrderService.class);
        bean.initOrder("1");
        System.in.read();
    }
}
