package com.xiaohu.design.creaetion.factory.simple;

import lombok.Data;

@Data
public abstract class SimpleOperationFactory {

    private String operationName;

    public static SimpleOperationFactory getSimpleOperation(String operationName) {
        return switch (operationName) {
            case "+" -> new AddOperation();
            case "*",default -> new MultiplicationOperation();
        };
    }

    public abstract int Operation(int num1, int num2);
}
