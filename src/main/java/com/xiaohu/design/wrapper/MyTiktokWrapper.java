package com.xiaohu.design.wrapper;

public class MyTiktokWrapper implements TiktokWrapper{

    private Tiktok tiktok;
    public  MyTiktokWrapper( Tiktok tiktok) {
        this.tiktok = tiktok;
    }
    @Override
    public void tiktok() {
        enable();
        tiktok.tiktok();
    }

    @Override
    public void enable() {
        System.out.println("开启美颜。。。鲜花蹭蹭");
    }
}
