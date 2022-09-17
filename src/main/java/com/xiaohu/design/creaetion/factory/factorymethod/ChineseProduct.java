package com.xiaohu.design.creaetion.factory.factorymethod;

public class ChineseProduct implements BookProduct{

    @Override
    public void read() {
        System.out.println("语文。。。。");
    }
}
