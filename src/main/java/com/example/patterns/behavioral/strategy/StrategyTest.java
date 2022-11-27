package com.example.patterns.behavioral.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        FootballTeam rubin = new Rubin(new DefendFootballStrategy());
        rubin.play();

        FootballTeam mc = new ManchesterCity(new AttackFootballStrategy());
        mc.play();

        System.out.println("Breaking news! Kurban Berdyev is new Manchester City couch!!!");
        mc.setGameStrategy(new DefendFootballStrategy());
        mc.play();

    }
}
