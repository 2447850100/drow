package com.xiaohu.design.creaetion.factory.factorymethod;

public class MusicProduct implements BookProduct{
    @Override
    public void read() {
        System.out.println("音乐...");
    }
}
