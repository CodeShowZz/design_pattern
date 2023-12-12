package com.designpattern.templatemethod;

public class ConcreteClassB extends AbstractClass {

    @Override
    public void concreteOperation1() {
        System.out.println("具体类B的操作1");
    }

    @Override
    public void concreteOperation2() {
        System.out.println("具体类B的操作2");
    }
}