package com.example.patterns.behavioral.visitor;

public abstract class Bank {

    abstract void serve(Individual client);

    abstract void serve(LegalEntity legalEntity);
}
