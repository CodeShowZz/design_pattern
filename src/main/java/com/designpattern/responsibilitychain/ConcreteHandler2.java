package com.designpattern.responsibilitychain;

public class ConcreteHandler2 extends Handler {

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