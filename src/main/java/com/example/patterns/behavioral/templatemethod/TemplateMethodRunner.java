package com.example.patterns.behavioral.templatemethod;

public class TemplateMethodRunner {
    public static void main(String[] args) {
        DailyRoutine studentDailyRoutine = new StudentDailyRoutine();
        DailyRoutine employedDailyRoutine = new EmployedDailyRoutine();
        DailyRoutine retireeDailyRoutine = new RetireeDailyRoutine();

        System.out.print("Student. ");
        studentDailyRoutine.planDay();

        System.out.println("\n========================\n");

        System.out.print("Employed. ");
        employedDailyRoutine.planDay();

        System.out.println("\n========================\n");

        System.out.print("Retiree. ");
        retireeDailyRoutine.planDay();

    }
}
