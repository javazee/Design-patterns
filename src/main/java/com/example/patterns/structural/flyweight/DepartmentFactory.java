package com.example.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DepartmentFactory {
    private Map<String, Department> departments;

    public DepartmentFactory(Map<String, Department> departments) {
        this.departments = new HashMap<>();
        this.departments.putAll(departments);
    }

    public Department getDepartment(String key) {
        Department department = departments.get(key);
        if (department == null) {
            switch (key) {
                case "lion" -> department = new Department("Gryffindor");
                case "badger" -> department = new Department("Hufflepuff");
                case "eagle" -> department = new Department("Ravenclaw");
                case "snake" -> department = new Department("Slytherin");
            }
            departments.put(key, department);
        }
        return department;
    }
}
