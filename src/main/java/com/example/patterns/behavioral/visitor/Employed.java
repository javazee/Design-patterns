package com.example.patterns.behavioral.visitor;

public class Employed extends Individual implements Visited {

    public Employed(String name) {
        super(name);
    }
    @Override
    public void accept(Bank bank) {
        bank.serve(this);
    }
}
