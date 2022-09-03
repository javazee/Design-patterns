package com.example.patterns.creational.factorymethod;

public class Porsche extends Car {
    @Override
    void startMoving() {
        System.out.println("Porsche started moving...");
    }

    @Override
    void move() {
        System.out.println("Porsche is moving...");
    }

    @Override
    void stop() {
        System.out.println("Porsche stopped moving...");
    }
}
