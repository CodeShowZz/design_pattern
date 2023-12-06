package com.designpattern.strategy;/**
 *
 * @description:
 * @author: Linhuang
 * @date: 2023-12-06 11:57
 */
public class Person {

    private Play play;

    public void setPlay(Play play) {
        this.play = play;
    }

    public void play() {
        play.play();
    }

}