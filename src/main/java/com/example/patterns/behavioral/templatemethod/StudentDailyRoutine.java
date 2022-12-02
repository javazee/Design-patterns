package com.example.patterns.behavioral.templatemethod;

public class StudentDailyRoutine implements DailyRoutine{

    @Override
    public void planMorning() {
        System.out.println("\t1) getting up at 10 AM");
        System.out.println("\t2) skipping at least 2 lessons");
        System.out.println("\t3) hangover");
    }

    @Override
    public void planAfternoon() {
        System.out.println("\t1) visiting university");
        System.out.println("\t2) hangout with friends");
    }

    @Override
    public void planEvening() {
        System.out.println("\t1) hangout till 4 AM");
    }
}
