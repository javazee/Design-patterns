package com.example.patterns.behavioral.state;

public interface Stage {

    Stage next();

    Stage previous();

    void executeStage();
}
