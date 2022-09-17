package com.xiaohu.design.creaetion.factory.factorymethod;

public class AddAndChineseFactory implements MathFactory{
    @Override
    public OperationFactory getOperationFactory() {
        return new AddOperationFactory();
    }

    @Override
    public BookFactory getBookFactory() {
        return new ChineseFactory();
    }
}
