package com.example.patterns.behavioral.interpretator;

public class From implements Expression{

    private String table;
    private Expression where;

    public From(String table) {
        this.table = table;
    }

    public From(String table, Expression where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public void interpret(Context context) {
        context.append(" from " + table);
        if (where == null) {
            context.execute();
        } else {
            where.interpret(context);
        }
    }
}
