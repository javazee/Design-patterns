package com.example.patterns.creational.singleton;

public class LazySingleton {
    private static LazySingleton singleton;

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
