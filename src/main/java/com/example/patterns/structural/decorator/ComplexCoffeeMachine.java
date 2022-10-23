package com.example.patterns.structural.decorator;

public class ComplexCoffeeMachine extends CoffeeMachineDecorator{

    public CoffeeMachine coffeeMachine;

    public ComplexCoffeeMachine(CoffeeMachine coffeeMachine) {
        super(coffeeMachine);
    }

    public String grindGrains() {
        return "coffeeMachine is able to grind coffee grains";
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + "\n" + grindGrains();
    }
}
