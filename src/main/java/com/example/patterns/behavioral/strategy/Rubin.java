package com.example.patterns.behavioral.strategy;

public class Rubin extends FootballTeam {

    public Rubin(GameStrategy gameStrategy) {
        super(gameStrategy);
    }

    @Override
    void play() {
        System.out.print("Rubin strategy: ");
        getGameStrategy().playUsingStrategy();

    }
}
