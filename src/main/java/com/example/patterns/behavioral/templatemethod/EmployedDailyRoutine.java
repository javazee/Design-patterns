package com.example.patterns.behavioral.templatemethod;

public class EmployedDailyRoutine implements DailyRoutine{

    @Override
    public void planMorning() {
        System.out.println("\t1) getting up at 7 AM");
        System.out.println("\t2) taking a shower");
        System.out.println("\t3) having breakfast");
        System.out.println("\t4) warming up a car");
    }

    @Override
    public void planAfternoon() {
        System.out.println("\t1) working");
    }

    @Override
    public void planEvening() {
        System.out.println("\t1) having dinner");
        System.out.println("\t2) do shopping");
        System.out.println("\t3) reading book");
        System.out.println("\t4) go to the bed at 11 PM");
    }
}
