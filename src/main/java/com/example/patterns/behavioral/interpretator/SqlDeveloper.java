package com.example.patterns.behavioral.interpretator;

public class SqlDeveloper {

    public static void main(String[] args) {
        Context context = new Context();
        Expression select = new Select("name", new From("developers"));
        select.interpret(context);

        Expression where = new Where("age", new Equal("24"));
        Expression selectFromWhere = new Select("name", new From("developers", where));
        selectFromWhere.interpret(context);
    }
}
