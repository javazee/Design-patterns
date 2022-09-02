package com.example.patterns.creational.singleton;

public class SimpleSingleton {

    private static final SimpleSingleton singleton = new SimpleSingleton();

    public static SimpleSingleton getInstance() {
        return singleton;
    }
}
