package com.example.patterns.behavioral.strategy;

public class AttackFootballStrategy implements FootballGameStrategy{

    @Override
    public void playUsingStrategy() {
        System.out.println("more attack, less defend. Preferred schema: 4-3-3");
    }
}
