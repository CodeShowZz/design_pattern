package com.designpattern.responsibilitychain;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-06 11:56
 */
public class Test {


    //测试方法
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        List<Integer> lists = Arrays.asList(2,5,24,421,12,29,11,9,20);
        for(int num : lists) {
            h1.handleRequest(num);
        }
    }}