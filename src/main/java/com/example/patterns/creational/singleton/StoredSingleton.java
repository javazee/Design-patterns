package com.example.patterns.creational.singleton;

public class StoredSingleton {

    public static class SingletonHolder {
        public static final StoredSingleton SINGLETON_INSTANCE = new StoredSingleton();
    }

    public static StoredSingleton getInstance() {
        return SingletonHolder.SINGLETON_INSTANCE;
    }
}
