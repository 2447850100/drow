package com.xiaohu.design.creaetion.factory.factorymethod;

public class SubtractionFactory implements OperationFactory{
    @Override
    public OperationProduct getOperationProduct() {
        return new SubtractionOperation();
    }
}
