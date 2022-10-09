package com.example.patterns.creational.abstractfactory;

public abstract class Computer {

    abstract void program();

    final void connectToInternet() {
        System.out.println("connecting to the internet");
    }
}
