package com.example.patterns.behavioral.mediator;

public class ApartmentBuyer {
    private String name;
    private Realtor realtor;

    public ApartmentBuyer(String name,
                          Realtor realtor) {
        this.name = name;
        this.realtor = realtor;
    }

    public void notify(String message) {
        System.out.println(name + " got notification: " + message);
    }

    public void lookingForApartment() {
        realtor.notifyOwners(this);
    }

    public String getName() {
        return name;
    }
}
