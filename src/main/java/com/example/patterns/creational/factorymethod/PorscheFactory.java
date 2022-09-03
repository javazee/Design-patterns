package com.example.patterns.creational.factorymethod;

public class PorscheFactory extends CarFactory{
    @Override
    public Car produceCar() {
        return new Porsche();
    }
}
