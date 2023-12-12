package com.designpattern.decorator;

public class ConcreteDecoratorA extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("装饰器A的功能");
    }
}
