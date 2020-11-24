package org.example.cglib;/*
    @author:zyh
    @Time:2020-11-08-15:37
    
    */

import org.example.jdk.proxy.TargetInter;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTes {
    public static void main(String[] args) {
        final Target target = new Target();
        final Advice advice = new Advice();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();
                Object invoke = method.invoke(target);
                advice.after();
                return invoke;
            }
        });
        Target o = (Target) enhancer.create();
        o.save();
    }
}
