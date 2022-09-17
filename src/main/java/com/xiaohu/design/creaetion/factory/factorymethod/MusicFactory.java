package com.xiaohu.design.creaetion.factory.factorymethod;

public class MusicFactory implements BookFactory{
    @Override
    public BookProduct getBookProduct() {
        return new MusicProduct();
    }
}
