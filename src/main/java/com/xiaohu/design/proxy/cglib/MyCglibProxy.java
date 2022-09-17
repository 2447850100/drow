package com.xiaohu.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class MyCglibProxy<T> {

    private T t;

    public MyCglibProxy(T t) {
        this.t = t;
    }

    public static <T> T getProxy(T t) {
        // 创建增强器
        Enhancer enhancer = new Enhancer();

        //设置增强代理目标类，通过构造一个目标类子类继承
        enhancer.setSuperclass(t.getClass());

        //设置回调方法，核心，方法拦截
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            if ("read".equals(method.getName())) {
                System.out.println("代理执行");
//                Object invoke = method.invoke(proxy , args);
                Object invoke = proxy.invokeSuper(obj, args);
                return invoke;
            }
            return null;
        });
        return (T)enhancer.create();
    }
}
