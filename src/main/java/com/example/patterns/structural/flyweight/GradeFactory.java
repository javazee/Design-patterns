package com.example.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeFactory {

    Map<String, Grade> grades;

    public GradeFactory(List<Grade> grades) {
        this.grades = new HashMap<>();
        for (Grade grade: grades) {
            this.grades.put(String.valueOf(grade.getGrade()), grade);
        }
    }

    public Grade getGrade(String key) {
        Grade grade = grades.get(key);
        if (grade == null) {
            grade = new Grade(Integer.parseInt(key));
            grades.put(key, grade);
        }
        return grade;
    }
}
