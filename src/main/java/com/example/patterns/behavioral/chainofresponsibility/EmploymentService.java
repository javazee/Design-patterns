package com.example.patterns.behavioral.chainofresponsibility;

public class EmploymentService {
    public static void main(String[] args) {
        Interviewer hr = new HR(Level.LOW);
        Interviewer supervisor = new SuperVisor(Level.MIDDLE);
        Interviewer ceo = new CEO(Level.HIGH);
        Interviewer owner = new Owner(Level.SUPREME);

        hr.setNextInterviewer(supervisor);
        supervisor.setNextInterviewer(ceo);
        ceo.setNextInterviewer(owner);

        hr.interview("Job seeker looks for first job\n", Level.LOW);

        hr.interview("Job seeker want to super high position", Level.HIGH);
    }
}
