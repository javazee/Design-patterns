package com.example.patterns.structural.decorator;

public class CappuccinoCoffeeMachine extends CoffeeMachineDecorator{

    private CoffeeMachine coffeeMachine;

    public CappuccinoCoffeeMachine(CoffeeMachine coffeeMachine) {
        super(coffeeMachine);
    }

    public String makeCappuccino() {
        return "coffeeMachine is able to make Cappuccino";
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + "\n" + makeCappuccino();
    }
}
