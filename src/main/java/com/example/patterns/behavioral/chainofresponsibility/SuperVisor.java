package com.example.patterns.behavioral.chainofresponsibility;

public class SuperVisor extends Interviewer{


    public SuperVisor(int level) {
        super(level);
    }

    @Override
    public void recordInterview(String report) {
        System.out.println("SuperVisor is interviewing job seeker. " + report);
    }
}
