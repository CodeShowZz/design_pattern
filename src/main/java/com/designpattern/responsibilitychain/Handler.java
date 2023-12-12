package com.designpattern.responsibilitychain;

//抽象父类
public abstract class Handler {

    protected Handler successor;

    //设置后继处理器,利用多态
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //由子类实现具体的处理请求方法
    public abstract void handleRequest(int request);
}


