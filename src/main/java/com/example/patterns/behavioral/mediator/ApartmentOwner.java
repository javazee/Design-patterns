package com.example.patterns.behavioral.mediator;

public class ApartmentOwner {

    private String name;
    private Realtor realtor;

    public ApartmentOwner(String name, Realtor realtor) {
        this.name = name;
        this.realtor = realtor;
    }

    public void notify(String message) {
        System.out.println(name + " got notification: " + message);
    }

    public void putUpForSale() {
        realtor.notifyBuyers(this);
    }

    public String getName() {
        return name;
    }
}
