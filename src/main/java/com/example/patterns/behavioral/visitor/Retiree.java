package com.example.patterns.behavioral.visitor;

public class Retiree extends Individual implements Visited{

    public Retiree(String name) {
        super(name);
    }

    @Override
    public void accept(Bank bank) {
        bank.serve(this);
    }
}
