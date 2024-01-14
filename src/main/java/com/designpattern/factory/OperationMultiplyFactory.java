package com.designpattern.factory;

/**
 * @author lin
 * @date 2024/1/14 18:45
 **/
public class OperationMultiplyFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new OperationMultiply();
    }
}
