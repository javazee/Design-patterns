package com.example.patterns.behavioral.observer;

public class ObserverRunner {

    public static void main(String[] args) {
        Client client = new Client("Vadim Sorokin");
        Client client1 = new Client("Olga Guseva");

        MarketingDepartment marketingDepartment = new MarketingDepartment();

        marketingDepartment.addClient(client);
        marketingDepartment.addClient(client1);

        marketingDepartment.addNotification("We've got special conditions for you for the next order...");

        marketingDepartment.addClient(new Client("Evgeniy Voronin"));

        marketingDepartment.addNotification("Black Friday!!! 50% discount for all items!!!");
    }
}
