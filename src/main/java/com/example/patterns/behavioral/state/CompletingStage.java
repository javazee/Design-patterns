package com.example.patterns.behavioral.state;

public class CompletingStage implements Stage{

    @Override
    public Stage next() {
        System.out.println("No next stage: project is on the last stage...");
        return null;
    }

    @Override
    public Stage previous() {
        return new MonitoringStage();
    }

    @Override
    public void executeStage() {
        System.out.println("completing project...");
    }
}
