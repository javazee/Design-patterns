package com.example.patterns.behavioral.strategy;

public abstract class FootballTeam extends Team{

    private GameStrategy gameStrategy;

    public FootballTeam(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public GameStrategy getGameStrategy() {
        return gameStrategy;
    }
}
