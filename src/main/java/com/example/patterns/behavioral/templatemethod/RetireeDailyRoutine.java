package com.example.patterns.behavioral.templatemethod;

public class RetireeDailyRoutine implements DailyRoutine {

    @Override
    public void planMorning() {
        System.out.println("\t1) getting up at 6 AM");
        System.out.println("\t2) cooking");
        System.out.println("\t3) washing and cleaning");
    }

    @Override
    public void planAfternoon() {
        System.out.println("\t1) walking");
        System.out.println("\t2) watching TV");
        System.out.println("\t3) reading newsPaper");
    }

    @Override
    public void planEvening() {
        System.out.println("\t1) watching TV");
        System.out.println("\t2) go to the bed at 9 PM");
    }
}
