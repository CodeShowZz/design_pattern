package com.designpattern.templatemethod;/**
 *
 * @description:+
 * @author: Linhuang
 * @date: 2023-12-06 11:55
 */
//抽象类
public abstract class AbstractClass {


    //具体行为,由子类实现
    public abstract void concreteOperation1();

    //具体行为,由子类实现
    public abstract void concreteOperation2();

    //父类定义模板方法
    public void templateMethod() {
        //可能这里有一些固定流程

        concreteOperation1(); //子类的具体行为
        concreteOperation2(); //子类的具体行为
    }

}

//具体实现子类
class ConcreteClassA extends AbstractClass {

    @Override
    public void concreteOperation1() {
        System.out.println("具体类A的操作1");
    }

    @Override
    public void concreteOperation2() {
        System.out.println("具体类A的操作2");
    }
}

class ConcreteClassB extends AbstractClass {

    @Override
    public void concreteOperation1() {
        System.out.println("具体类B的操作1");
    }

    @Override
    public void concreteOperation2() {
        System.out.println("具体类B的操作2");
    }
}

