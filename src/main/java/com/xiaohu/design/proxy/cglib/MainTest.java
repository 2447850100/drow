package com.xiaohu.design.proxy.cglib;

public class MainTest {

    public static void main(String[] args) {
        XiaohuStudent proxy = MyCglibProxy.getProxy(new XiaohuStudent());
        String read = proxy.read();
        System.out.println("read = " + read);
        proxy.write();
    }
}
