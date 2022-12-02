package com.example.patterns.behavioral.templatemethod;

public interface DailyRoutine {

    default void planDay() {
        System.out.println("Daily routine in the morning:");
        planMorning();
        System.out.println("Daily routine in the afternoon:");
        planAfternoon();
        System.out.println("Daily routine in the evening:");
        planEvening();
    }

    void planMorning();

    void planAfternoon();

    void planEvening();


}
