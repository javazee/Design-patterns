package com.example.patterns.structural.decorator;

public class CoffeeMachineDecorator implements CoffeeMachine{

    private CoffeeMachine coffeeMachine;

    public CoffeeMachineDecorator(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public String makeCoffee() {
        return coffeeMachine.makeCoffee();
    }
}
