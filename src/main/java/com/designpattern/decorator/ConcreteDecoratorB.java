package com.designpattern.decorator;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("装饰器B的功能");
    }
}
