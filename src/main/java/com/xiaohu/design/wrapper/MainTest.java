package com.xiaohu.design.wrapper;

public class MainTest {
    public static void main(String[] args) {

//        MyTiktokWrapper myTiktokWrapper = new MyTiktokWrapper(new XiaoHuTiktok());
//        myTiktokWrapper.tiktok();
        MyHttpSessionWrapperImpl wrapper = new MyHttpSessionWrapperImpl(new MyHttpSessionImpl());
        String message = wrapper.getAttribute();
        wrapper.setAttribute(message);
    }
}
