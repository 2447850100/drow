package com.xiaohu.design.creaetion.factory.factorymethod;

public class MainTest {
    public static void main(String[] args) {

        //method1();

        MathFactory factory = new AddAndChineseFactory();
        BookFactory bookFactory = factory.getBookFactory();
        OperationFactory operationFactory = factory.getOperationFactory();
        bookFactory.getBookProduct().read();
        int num = operationFactory.getOperationProduct().operation(2, 22);
        System.out.println("num = " + num);
    }

    private static void method1() {
        OperationFactory factory = new AddOperationFactory();
        OperationProduct operationProduct = factory.getOperationProduct();
        int addNum = operationProduct.operation(1, 4);
        System.out.println("addNum = " + addNum);
        factory = new MultiplicationFactory();
        operationProduct = factory.getOperationProduct();
        int mulity = operationProduct.operation(2, 4);
        System.out.println("mulity = " + mulity);

        factory = new SubtractionFactory();
        int subtract = factory.getOperationProduct().operation(3, 1);
        System.out.println("subtract = " + subtract);
    }
}
