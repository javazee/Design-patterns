package com.example.patterns.behavioral.strategy;

public class ManchesterCity extends FootballTeam {

    public ManchesterCity(GameStrategy gameStrategy) {
        super(gameStrategy);
    }

    @Override
    void play() {
        System.out.print("ManchesterCity strategy: ");
        getGameStrategy().playUsingStrategy();
    }
}
