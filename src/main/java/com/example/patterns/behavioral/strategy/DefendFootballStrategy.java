package com.example.patterns.behavioral.strategy;

public class DefendFootballStrategy implements FootballGameStrategy{
    @Override
    public void playUsingStrategy() {
        System.out.println("more defend, less attack. Preferred schema: 5-4-1");
    }
}
