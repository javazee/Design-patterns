package com.example.patterns.behavioral.visitor;

public abstract class Individual {

    private final String name;

    public Individual(String name) {
        this.name = name;
    }

    final public String getName() {
        return name;
    }
}
