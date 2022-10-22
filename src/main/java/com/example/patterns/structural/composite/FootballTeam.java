package com.example.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FootballTeam implements Playable{

    private String name;
    private final List<Playable> players = new ArrayList<>();

    public FootballTeam(String name) {
        this.name = name;
    }

    public void addPlayer(Playable player) {
        players.add(player);
    }

    public void removePlayer(Playable player) {
        players.remove(player);
    }

    public List<Playable> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf("team %s play in football\n", name);
    }
}
