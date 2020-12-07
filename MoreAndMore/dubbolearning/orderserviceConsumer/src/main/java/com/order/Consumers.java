package com.order;

import org.example.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Consumers
{
    @SuppressWarnings("resource")
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumers.xml");
        OrderService bean = context.getBean(OrderService.class);
        bean.initOrder("1");
        System.in.read();
    }
}
