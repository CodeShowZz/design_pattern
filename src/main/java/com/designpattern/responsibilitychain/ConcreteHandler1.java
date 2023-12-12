package com.designpattern.responsibilitychain;

public class ConcreteHandler1 extends Handler {

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