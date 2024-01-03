package com.designpattern.proxy;

/**
 * @author lin
 * @date 2024/1/3 2:44
 **/
public class Proxy implements Subject{

    private RealSubject realSubject = new RealSubject();
    @Override
    public void request() {
        realSubject.request();
    }
}
