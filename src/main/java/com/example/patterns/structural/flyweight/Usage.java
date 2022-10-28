package com.example.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Usage {
    public static void main(String[] args) {
        List<Grade> grades = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            grades.add(new Grade(i));
        }
        GradeFactory gradeFactory = new GradeFactory(grades);

        HashMap<String, Department> departments = new HashMap<>();
        departments.put("lion", new Department(" Gryffindor"));
        departments.put("badger", new Department(" Hufflepuff"));
        DepartmentFactory departmentFactory = new DepartmentFactory(departments);

        List<Wizard> wizards = new ArrayList<>();

        for (int i = 1; i < 10; i ++) {
            wizards.add(new Wizard(String.format("Wizard_%s", i), gradeFactory.getGrade(String.valueOf(new Random().nextInt(1, 7))), departmentFactory.getDepartment("lion")));
            wizards.add(new Wizard(String.format("Wizard_1%s", i), gradeFactory.getGrade(String.valueOf(new Random().nextInt(1, 7))), departmentFactory.getDepartment("badger")));
            wizards.add(new Wizard(String.format("Wizard_2%s", i), gradeFactory.getGrade(String.valueOf(new Random().nextInt(1, 7))), departmentFactory.getDepartment("snake")));
            wizards.add(new Wizard(String.format("Wizard_3%s", i), gradeFactory.getGrade(String.valueOf(new Random().nextInt(1, 7))), departmentFactory.getDepartment("eagle")));
        }

        wizards.forEach(wizard -> System.out.println(wizard.toString()));

    }
}
