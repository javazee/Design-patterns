package com.example.patterns.structural.facade;

public class TransactionManager {

    public void initTransactions() {
        System.out.println("init transactions...");
    }

    public void beginTransaction() {
        System.out.println("begin transaction...");
    }

    public void commitTransaction() {
        System.out.println("commit transaction...");
    }

    public void closeTransaction() {
        System.out.println("close transaction...");
    }

    public void flush() {
        System.out.println("flush...");
    }
}
