package com.designpattern.strategy;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-06 11:58
 */
public class Test {


    public static void main(String[] args) {
        Person cxk = new Person();
        System.out.println("大家好,我是练习时长两年半的练习生cxk,以下是才艺展示");

        Play singSongs = new SingSongs();
        cxk.setPlay(singSongs);
        cxk.play();

        Play jump = new Jump();
        cxk.setPlay(jump);
        cxk.play();

        Play rap = new Rap();
        cxk.setPlay(rap);
        cxk.play();

        Play playBasketball = new PlayBasketBall();
        cxk.setPlay(playBasketball);
        cxk.play();
    }
}