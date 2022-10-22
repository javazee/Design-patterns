package com.example.patterns.structural.composite;

public class FootballPlayer implements Playable{

    private Integer number;

    public FootballPlayer(Integer number) {
        this.number = number;
    }

    @Override
    public void play() {
        System.out.printf("player %d play in football\n", number);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}