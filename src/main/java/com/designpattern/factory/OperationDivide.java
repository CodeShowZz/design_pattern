package com.designpattern.factory;

/**
 * @author lin
 * @date 2024/1/14 18:44
 **/
public class OperationDivide implements Operation {
    @Override
    public int operation(int x, int y) {
       return x / y;
    }
}
