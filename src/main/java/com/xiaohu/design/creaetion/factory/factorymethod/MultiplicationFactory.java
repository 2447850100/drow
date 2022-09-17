package com.xiaohu.design.creaetion.factory.factorymethod;

public class MultiplicationFactory implements OperationFactory{
    @Override
    public OperationProduct getOperationProduct() {
        return new MultiplicationOperation();
    }
}
