package com.example.patterns.behavioral.state;

public class PlanningStage implements Stage {
    @Override
    public Stage next() {
        return new ImplementationStage();
    }

    @Override
    public Stage previous() {
        return new InitStage();
    }

    @Override
    public void executeStage() {
        System.out.println("Planning new project...");
    }
}
