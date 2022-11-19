package com.example.patterns.behavioral.observer;

public interface Observed {

    void addClient(Client client);

    void removeClient(Client client);

    void notifyClients();
}
