package com.example.patterns.creational.singleton;

public class DoubleCheckingSingleton {

    private static DoubleCheckingSingleton doubleCheckingSingleton;

    public static synchronized DoubleCheckingSingleton getInstance() {
        if (doubleCheckingSingleton == null) {
            synchronized (DoubleCheckingSingleton.class) {
                if (doubleCheckingSingleton == null) {
                    doubleCheckingSingleton = new DoubleCheckingSingleton();
                }
            }
        }
        return doubleCheckingSingleton;
    }
}
