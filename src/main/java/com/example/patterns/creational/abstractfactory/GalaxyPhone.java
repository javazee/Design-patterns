package com.example.patterns.creational.abstractfactory;

public class GalaxyPhone extends Phone{

    @Override
    public void doCall() {
        System.out.println("calling from Galaxy");
    }

    @Override
    public void hangUp() {
        System.out.println("break conversation");
    }

    @Override
    public void sendMessage() {
        System.out.println("sending message using Galaxy");
    }
}
