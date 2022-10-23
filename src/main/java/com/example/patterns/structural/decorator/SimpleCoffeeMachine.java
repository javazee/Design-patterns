package com.example.patterns.structural.decorator;

public class SimpleCoffeeMachine implements CoffeeMachine {

    @Override
    public String makeCoffee() {
        return "coffeeMachine is able to make Americano";
    }
}
