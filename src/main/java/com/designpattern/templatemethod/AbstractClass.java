package com.designpattern.templatemethod;

/**
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





