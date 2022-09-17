package com.xiaohu.design.creaetion.factory.simple;

public class  MultiplicationOperation extends  SimpleOperationFactory{


    @Override
    public int Operation( int num1, int num2) {
        return num1 * num2;
    }
}
