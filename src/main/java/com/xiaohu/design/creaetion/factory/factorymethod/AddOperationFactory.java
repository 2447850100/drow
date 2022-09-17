package com.xiaohu.design.creaetion.factory.factorymethod;

public class AddOperationFactory implements OperationFactory{
    @Override
    public OperationProduct getOperationProduct() {
        return new AddOperation();
    }
}
