package com.example.patterns.behavioral.chainofresponsibility;

public class CEO extends Interviewer {

    public CEO(int level) {
        super(level);
    }

    @Override
    public void recordInterview(String report) {
        System.out.println("CEO is interviewing job seeker. " + report);
    }
}
