package com.example.patterns.behavioral.interpretator;

public class Equal implements Expression{

    private String value;
    private Expression expression;

    public Equal(String value) {
        this.value = value;
    }

    public Equal(String value, Expression expression) {
        this.value = value;
        this.expression = expression;
    }


    @Override
    public void interpret(Context context) {
        context.append(" = ");
        context.append(value);
        if (expression == null) {
            context.execute();
        } else {
            expression.interpret(context);
        }
    }
}
