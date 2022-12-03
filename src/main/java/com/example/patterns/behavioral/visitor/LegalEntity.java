package com.example.patterns.behavioral.visitor;

public class LegalEntity implements Visited{

    private String title;

    public LegalEntity(String title) {
        this.title = title;
    }

    @Override
    public void accept(Bank bank) {
        bank.serve(this);
    }

    public String getTitle() {
        return title;
    }
}
