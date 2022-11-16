package com.example.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Realtor {

    private List<ApartmentOwner> owners = new ArrayList<>();
    private List<ApartmentBuyer> buyers = new ArrayList<>();

    public void notifyOwners(ApartmentBuyer buyer) {
        for (ApartmentOwner owner: owners) {
            owner.notify(buyer.getName() + " wants to buy an apartment");
        }
    }

    public void notifyBuyers(ApartmentOwner owner) {
        for (ApartmentBuyer buyer: buyers) {
            buyer.notify(owner.getName() + " wants to sell an apartment");
        }
    }

    public void addOwner(ApartmentOwner owner) {
        owners.add(owner);
    }

    public void addBuyer(ApartmentBuyer buyer) {
        buyers.add(buyer);
    }
}


