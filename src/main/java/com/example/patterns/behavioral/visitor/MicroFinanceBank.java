package com.example.patterns.behavioral.visitor;

public class MicroFinanceBank extends Bank{

    @Override
    void serve(Individual client) {
        if (client instanceof Unemployed) {
            System.out.println(client.getName() + ", we can give you till 10_000 rub, no more");
        } else if (client instanceof Employed) {
            System.out.println(client.getName() + ", we can give you till 1_000_000 rub depends on your revenue");
        } else if (client instanceof Retiree) {
            System.out.println(client.getName() + ", we can give you till 100_000 rub");
        }
    }

    @Override
    void serve(LegalEntity legalEntity) {
        System.out.println(legalEntity.getTitle() + ", unfortunately, we don't serve legal persons");
    }
}
