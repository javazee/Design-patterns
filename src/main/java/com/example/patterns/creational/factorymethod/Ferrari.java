package com.example.patterns.creational.factorymethod;

public class Ferrari extends Car {
    @Override
    void startMoving() {
        System.out.println("Ferrari started moving...");
    }

    @Override
    void move() {
        System.out.println("Ferrari is moving...");
    }

    @Override
    void stop() {
        System.out.println("Ferrari stopped moving...");
    }
}
