package com.xiaohu.design.creaetion.factory.simple;

public class MainTest {

    public static void main(String[] args) {
        SimpleOperationFactory factory = OperationPlatform.getFactory("*");
        int num = factory.Operation(1, 2);
        System.out.println("num = " + num);

    }
}
