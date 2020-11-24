package org.example.jdk.test;/*
    @author:zyh
    @Time:2020-11-08-15:37
    
    */

import org.example.jdk.proxy.Advice;
import org.example.jdk.proxy.TargetInter;
import org.example.jdk.proxy.impl.Target;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTes {
    public static void main(String[] args) {
        final Target target = new Target();
        //获取增强对象
        final Advice advice = new Advice();
        TargetInter o = (TargetInter)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before();
                        Object invoke = method.invoke(target);//执行目标方法
                        advice.after();
                        return invoke;
                    }
                });//第一个是目标对象类加载器，
// 第二个是目标对象相同的接口字节码对象数组，
        // 第三个是Invocation
        o.save();
    }
}
