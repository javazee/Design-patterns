package com.example.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MarketingDepartment implements Observed {

    private List<Observer> clients = new ArrayList<>();
    private Stack<String> notifications = new Stack<>();

    public void addNotification(String message) {
        this.notifications.push(message);
        notifyClients();
    }

    @Override
    public void addClient(Client client) {
        this.clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        this.clients.remove(client);
    }

    @Override
    public void notifyClients() {
        String message = notifications.peek();
        clients.forEach(client -> client.handleNotification(message));
    }
}



