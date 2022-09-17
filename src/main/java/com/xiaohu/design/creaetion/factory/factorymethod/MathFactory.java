package com.xiaohu.design.creaetion.factory.factorymethod;

public interface MathFactory {

    OperationFactory getOperationFactory();

    BookFactory getBookFactory();
}
