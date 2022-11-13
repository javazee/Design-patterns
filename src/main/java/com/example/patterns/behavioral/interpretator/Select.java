package com.example.patterns.behavioral.interpretator;

public class Select implements Expression {
    private String column;
    private Expression from;


    public Select(String column, Expression from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public void interpret(Context context) {
        context.append("select " + column);
        from.interpret(context);
    }
}
