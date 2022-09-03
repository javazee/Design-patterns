package com.example.patterns.creational.factorymethod;

public class MercedesFactory extends CarFactory{
    @Override
    public Car produceCar() {
        return new Mercedes();
    }
}
