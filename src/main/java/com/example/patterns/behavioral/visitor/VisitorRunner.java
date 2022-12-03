package com.example.patterns.behavioral.visitor;

public class VisitorRunner {
    public static void main(String[] args) {
        ClientsDatabase clients = new ClientsDatabase();
        clients.addClient(new Employed("Konstantin"));
        clients.addClient(new Unemployed("Tolyan"));
        clients.addClient(new Retiree("Petrovich"));
        clients.addClient(new LegalEntity("IP Romanov"));

        System.out.println("Proposals of microFinanceBank:");
        Bank microFinanceBank = new MicroFinanceBank();
        clients.accept(microFinanceBank);

        System.out.println("\n===========================\n");

        System.out.println("Proposals of businessBank:");
        Bank businessBank = new BusinessBank();
        clients.accept(businessBank);
    }
}
