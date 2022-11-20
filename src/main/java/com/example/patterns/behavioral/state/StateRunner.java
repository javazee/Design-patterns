package com.example.patterns.behavioral.state;

public class StateRunner {
    public static void main(String[] args) {
        ProjectManagement management = new ProjectManagement();
        management.doNextStage();
        management.doNextStage();
        management.doNextStage();
        management.doNextStage();
        management.doNextStage();
        management.doNextStage();
        management.doNextStage();
        management.returnToPreviousStage();

    }
}
