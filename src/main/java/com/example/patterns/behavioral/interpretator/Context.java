package com.example.patterns.behavioral.interpretator;

public class Context {
    private StringBuilder query;

    public Context() {
        query = new StringBuilder();
    }


    public void execute() {
        System.out.println(query.toString());
    }

    public void append(String s) {
        query.append(s);
    }

    public StringBuilder getQuery() {
        return query;
    }
}
