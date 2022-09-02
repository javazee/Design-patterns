package com.example.patterns.creational.singleton;

public class LazySynchronizedSingleton {

    private static LazySynchronizedSingleton singleton;

    public synchronized static LazySynchronizedSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySynchronizedSingleton();
        }
        return singleton;
    }
}
