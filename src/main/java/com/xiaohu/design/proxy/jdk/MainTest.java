package com.xiaohu.design.proxy.jdk;

public class MainTest {

    public static void main(String[] args) {

        XiaoHuWorkInterface proxy = XiaohuJdkProxy.getProxy(new XiaohuInterfaceImpl());
        String read = proxy.read();
        System.out.println("read = " + read);
        proxy.writeMessage();
    }
}
