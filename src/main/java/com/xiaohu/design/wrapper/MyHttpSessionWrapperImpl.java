package com.xiaohu.design.wrapper;

public class MyHttpSessionWrapperImpl implements MyHttpSessionWrapper{

    private MyHttpSession myHttpSession;

    public MyHttpSessionWrapperImpl(MyHttpSession myHttpSession) {
        this.myHttpSession = myHttpSession;
    }

    @Override
    public String getAttribute() {
            String message = myHttpSession.getAttribute();
            System.out.println("从redis获取");
            return message;
    }

    @Override
        public void setAttribute(String message) {
        System.out.println("填充到redis" + message);
        }
}
