package com.designpattern.factory;

/**
 * @author lin
 * @date 2024/1/14 18:47
 **/
public class Client {

    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationMinusFactory();
        Operation add = operationFactory.createOperation();
        int res = add.operation(1,2);
        System.out.println(res);
    }
}
