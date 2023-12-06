package com.designpattern.templatemethod;/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-06 11:56
 */
public class Test {


    //测试类
    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        AbstractClass concreteClassB = new ConcreteClassB();
        concreteClassA.templateMethod();
        concreteClassB.templateMethod();
    }
}