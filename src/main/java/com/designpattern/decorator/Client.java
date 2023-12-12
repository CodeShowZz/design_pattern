package com.designpattern.decorator;

public class Client {

    public static void main(String[] args) {
        ConcreteComponent c= new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(c);
        concreteDecoratorB.setComponent(concreteDecoratorA);

        concreteDecoratorB.operation();
    }
}
