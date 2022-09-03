package com.example.patterns.creational.factorymethod;

public class Mercedes extends Car{
    @Override
    void startMoving() {
        System.out.println("Mercedes started moving...");
    }

    @Override
    void move() {
        System.out.println("Mercedes is moving...");
    }

    @Override
    void stop() {
        System.out.println("Mercedes stopped moving...");
    }
}
