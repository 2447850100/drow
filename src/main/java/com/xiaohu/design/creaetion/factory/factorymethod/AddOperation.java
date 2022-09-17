package com.xiaohu.design.creaetion.factory.factorymethod;

public class AddOperation implements OperationProduct{
    @Override
    public int operation(int num1,int num2) {
        return num1 + num2;
    }
}
