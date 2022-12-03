package com.example.patterns.behavioral.visitor;

public class BusinessBank extends Bank{

    @Override
    void serve(Individual client) {
        System.out.println(client.getName() + ", unfortunately, we don't serve individual persons");
    }

    @Override
    void serve(LegalEntity legalEntity) {
        System.out.println(legalEntity.getTitle() + ", we can give you credit depends on your financial turnover");
    }
}
