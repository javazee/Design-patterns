package com.example.patterns.decorator;

import com.example.patterns.structural.decorator.CappuccinoCoffeeMachine;
import com.example.patterns.structural.decorator.CoffeeMachine;
import com.example.patterns.structural.decorator.ComplexCoffeeMachine;
import com.example.patterns.structural.decorator.SimpleCoffeeMachine;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        CoffeeMachine coffeeMachine = new SimpleCoffeeMachine();
        System.out.println(coffeeMachine.getClass().getSimpleName() + ":" + System.lineSeparator() + coffeeMachine.makeCoffee() + System.lineSeparator());

        CoffeeMachine cappuccinoMachine = new CappuccinoCoffeeMachine(coffeeMachine);
        System.out.println(cappuccinoMachine.getClass().getSimpleName() + ":" + System.lineSeparator() + cappuccinoMachine.makeCoffee() + System.lineSeparator());

        CoffeeMachine complexMachine = new ComplexCoffeeMachine(cappuccinoMachine);
        System.out.println(complexMachine.getClass().getSimpleName() + ":" + System.lineSeparator() + complexMachine.makeCoffee());
    }
}
