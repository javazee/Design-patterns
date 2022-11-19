package com.example.patterns.behavioral.observer;

public class Client implements Observer{
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void handleNotification(String message) {
        System.out.println(name + " got new message: " + message);
    }
}
