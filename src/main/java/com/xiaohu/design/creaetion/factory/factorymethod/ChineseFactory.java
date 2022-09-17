package com.xiaohu.design.creaetion.factory.factorymethod;

public class ChineseFactory implements BookFactory{
    @Override
    public BookProduct getBookProduct() {
        return new ChineseProduct();
    }
}
