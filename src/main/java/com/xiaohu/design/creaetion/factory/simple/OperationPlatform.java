package com.xiaohu.design.creaetion.factory.simple;

public class OperationPlatform {

    public static SimpleOperationFactory getFactory(String operationName) {
        return SimpleOperationFactory.getSimpleOperation(operationName);
    }
}
