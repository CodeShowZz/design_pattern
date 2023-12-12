package com.designpattern.strategy;

public class Jump implements Play{

    @Override
    public void play() {
        System.out.println("跳");
    }
}
