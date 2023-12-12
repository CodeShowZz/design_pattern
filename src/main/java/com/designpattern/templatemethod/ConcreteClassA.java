package com.designpattern.templatemethod;

public class ConcreteClassA extends AbstractClass {

    @Override
    public void concreteOperation1() {
        System.out.println("具体类A的操作1");
    }

    @Override
    public void concreteOperation2() {
        System.out.println("具体类A的操作2");
    }
}