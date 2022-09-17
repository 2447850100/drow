package com.xiaohu.design.wrapper;

public class MyHttpSessionImpl implements MyHttpSession{
    @Override
    public String getAttribute() {
        System.out.println("从本地内存获取");
        return "hello";
    }

    @Override
    public void setAttribute(String message) {
        System.out.println("填充到本地内存中");
    }
}
