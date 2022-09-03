package com.example.patterns.creational.factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {
        Car car = getFactory("ferrari").produceCar();
        Assert.assertTrue(car instanceof Ferrari);

        car = getFactory("mercedes").produceCar();
        Assert.assertTrue(car instanceof Mercedes);

        car = getFactory("porsche").produceCar();
        Assert.assertTrue(car instanceof Porsche);

    }

    private static CarFactory getFactory(String brand) {
        if (brand.equalsIgnoreCase("ferrari")) {
            return new FerrariFactory();
        } else if (brand.equalsIgnoreCase("mercedes")) {
            return new MercedesFactory();
        } else if (brand.equalsIgnoreCase("porsche")) {
            return new PorscheFactory();
        } else {
            System.out.println("Unknown brand for car");
            return null;
        }
    }
}
