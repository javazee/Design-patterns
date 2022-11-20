package com.example.patterns.behavioral.state;

public class MonitoringStage implements Stage{
    @Override
    public Stage next() {
        return new CompletingStage();
    }

    @Override
    public Stage previous() {
        return new ImplementationStage();
    }

    @Override
    public void executeStage() {
        System.out.println("monitoring project...");
    }
}
