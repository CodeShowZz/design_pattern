package com.designpattern.strategy;

public class SingSongs implements Play{

    @Override
    public void play() {
        System.out.println("唱");
    }
}