package com.example.patterns.creational.factorymethod;

public class FerrariFactory extends CarFactory{
    @Override
    public Car produceCar() {
        return new Ferrari();
    }
}
