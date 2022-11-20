package com.example.patterns.behavioral.state;

public class ImplementationStage implements Stage{

    @Override
    public Stage next() {
        return new MonitoringStage();
    }

    @Override
    public Stage previous() {
        return new PlanningStage();
    }

    @Override
    public void executeStage() {
        System.out.println("implementation project...");
    }
}
