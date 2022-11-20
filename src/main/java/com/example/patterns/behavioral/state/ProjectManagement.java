package com.example.patterns.behavioral.state;

public class ProjectManagement {

    private Stage stage = new InitStage();
    private Stage previousStage;

    public void doNextStage() {
        if (stage != null) {
            previousStage = stage;
            stage.executeStage();
            stage = stage.next();
        }
    }

    public void returnToPreviousStage() {
        System.out.println("returning to the previous stage...");
        stage = previousStage.previous();
        stage.executeStage();
    }
}
