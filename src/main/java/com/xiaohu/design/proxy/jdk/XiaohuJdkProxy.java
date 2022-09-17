package com.xiaohu.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class XiaohuJdkProxy<T>  implements InvocationHandler {

    private T t;

    public XiaohuJdkProxy(T t) {
        this.t = t;
    }

    public static <T> T getProxy(T t) {
//        Object instance = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new XiaohuJdkProxy<>(t));
//        return (T)instance;
        return  (T)Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), (proxy,method,args) -> {
            if ("read".equals(method.getName())) {
                System.out.println("执行代理模式");
                Object invoke = method.invoke(t, args);
                invoke = invoke + ":huqiang";
                return invoke;
            }
            return null;
        });

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理模式");
        if (method.getName().equals("read")) {
            Object o = method.invoke(t, args);
            return (T)o;
        }
        return null;
    }
}
