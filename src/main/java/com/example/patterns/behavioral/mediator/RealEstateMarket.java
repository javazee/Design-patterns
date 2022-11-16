package com.example.patterns.behavioral.mediator;

public class RealEstateMarket {
    public static void main(String[] args) {
        Realtor realtor = new Realtor();
        ApartmentBuyer buyer = new ApartmentBuyer("John", realtor);
        ApartmentBuyer buyer1 = new ApartmentBuyer("Nikola", realtor);
        ApartmentOwner owner = new ApartmentOwner("Sergey", realtor);
        ApartmentOwner owner1 = new ApartmentOwner("Malkolm", realtor);
        realtor.addBuyer(buyer);
        realtor.addBuyer(buyer1);
        realtor.notifyOwners(buyer); //nothing happened

        realtor.addOwner(owner);
        realtor.addOwner(owner1);
        realtor.notifyOwners(buyer);

        realtor.notifyBuyers(owner1);

    }
}
