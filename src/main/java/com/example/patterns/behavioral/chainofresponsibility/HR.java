package com.example.patterns.behavioral.chainofresponsibility;

public class HR extends Interviewer {

    public HR(int level) {
        super(level);
    }

    @Override
    public void recordInterview(String report) {
        System.out.println("HR is interviewing job seeker. " + report);
    }
}
