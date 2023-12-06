package com.designpattern.strategy;

public interface Play {

    void play();
}

class SingSongs implements Play{

    @Override
    public void play() {
        System.out.println("唱");
    }
}


class Jump implements Play{

    @Override
    public void play() {
        System.out.println("跳");
    }
}

class Rap implements Play {

    @Override
    public void play() {
        System.out.println("rap");
    }
}

class PlayBasketBall implements Play{

    @Override
    public void play() {
        System.out.println("篮球");
    }
}

