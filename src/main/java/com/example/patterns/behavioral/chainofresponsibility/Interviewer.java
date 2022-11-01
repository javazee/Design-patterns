package com.example.patterns.behavioral.chainofresponsibility;

public abstract class Interviewer {
    private final int position;
    private Interviewer nextInterviewer;

    public Interviewer(int level) {
        this.position = level;
    }

    public void setNextInterviewer(Interviewer nextInterviewer) {
        this.nextInterviewer = nextInterviewer;
    }

    public void interview(String reason, int level) {
        if (level >= position) {
            recordInterview(reason);
        }
        if (nextInterviewer != null) {
            nextInterviewer.interview(reason, level);
        }
    }

    public abstract void recordInterview(String report);
}
