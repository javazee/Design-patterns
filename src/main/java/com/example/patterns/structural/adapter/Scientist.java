package com.example.patterns.structural.adapter;

public class Scientist {

    public String name;

    public Scientist(String name) {
        this.name = name;
    }

    public void explore() {
        System.out.println("scientist are exploring object...\n");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
