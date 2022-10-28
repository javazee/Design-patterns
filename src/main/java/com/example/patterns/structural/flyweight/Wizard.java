package com.example.patterns.structural.flyweight;

public class Wizard{
    private String name;
    private Grade grade;
    private Department department;

    public Wizard(String name,
                  Grade grade,
                  Department department) {
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("Wizard %s is studying in %s (%s) at %d grade(%s)", name, department.getTitle(), department.toString(), grade.getGrade(), grade);
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public Grade getGrade() {
        return grade;
    }
}
