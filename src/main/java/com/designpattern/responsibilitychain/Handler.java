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

class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        //对请求做一个判断,处理不了,让后继者处理
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass().getSimpleName() + "处理请求:" + request);
        } else if(successor != null){
            successor.handleRequest(request);
        }
    }
}


class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        //对请求做一个判断,处理不了,让后继者处理
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass().getSimpleName() + "处理请求:" + request);
        } else if(successor != null){
            successor.handleRequest(request);
        }
    }
}

class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        //对请求做一个判断,处理不了,让后继者处理
        if (request > 20 && request < 30) {
            System.out.println(this.getClass().getSimpleName() + "处理请求:" + request);
        } else if(successor != null){
            successor.handleRequest(request);
        }
    }
}