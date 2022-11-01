package com.example.patterns.behavioral.chainofresponsibility;

public class Owner extends Interviewer {

    public Owner(int level) {
        super(level);
    }

    @Override
    public void recordInterview(String report) {
        System.out.println("Owner is interviewing job seeker. " + report);
    }
}
