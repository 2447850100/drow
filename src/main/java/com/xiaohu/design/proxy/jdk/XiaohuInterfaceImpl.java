package com.xiaohu.design.proxy.jdk;

public class XiaohuInterfaceImpl implements XiaoHuWorkInterface{
    @Override
    public String read() {
        System.out.println("一般读书");
        return "hello";
    }

    @Override
    public void writeMessage() {
        System.out.println("写了一句话");
    }
}
