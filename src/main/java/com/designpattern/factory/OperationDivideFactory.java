package com.designpattern.factory;

/**
 * @author lin
 * @date 2024/1/14 18:45
 **/
public class OperationDivideFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationDivide();
    }
}
