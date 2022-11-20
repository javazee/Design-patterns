package com.example.patterns.behavioral.state;

public class InitStage implements Stage {

    @Override
    public Stage next() {
        return new PlanningStage();
    }

    @Override
    public Stage previous() {
        return null;
    }

    @Override
    public void executeStage() {
        System.out.println("Idea for new project!!! Starting new project...");
    }
}
