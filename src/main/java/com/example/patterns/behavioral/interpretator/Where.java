package com.example.patterns.behavioral.interpretator;

public class Where implements Expression {

    private String column;
    private Expression expression;


    public Where(String column, Expression expression) {
        this.column = column;
        this.expression = expression;
    }

    @Override
    public void interpret(Context context) {
        context.append(" where " + column);
        if (expression == null) {
            context.execute();
        } else {
            expression.interpret(context);
        }
    }
}
