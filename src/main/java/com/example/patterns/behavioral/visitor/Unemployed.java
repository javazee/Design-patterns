package com.example.patterns.behavioral.visitor;

public class Unemployed extends Individual implements Visited{

    public Unemployed(String name) {
        super(name);
    }

    @Override
    public void accept(Bank bank) {
        bank.serve(this);
    }
}
