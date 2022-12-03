package com.example.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ClientsDatabase implements Visited{

    private final List<Visited> clients = new ArrayList<>();

    public void addClient(Visited client) {
        clients.add(client);
    }

    @Override
    public void accept(Bank bank) {
        clients.forEach(visited -> visited.accept(bank));
    }
}
