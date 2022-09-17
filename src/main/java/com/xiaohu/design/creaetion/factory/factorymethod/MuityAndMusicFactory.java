package com.xiaohu.design.creaetion.factory.factorymethod;

public class MuityAndMusicFactory implements MathFactory{
    @Override
    public OperationFactory getOperationFactory() {
        return new MultiplicationFactory();
    }

    @Override
    public BookFactory getBookFactory() {
        return new MusicFactory();
    }
}
