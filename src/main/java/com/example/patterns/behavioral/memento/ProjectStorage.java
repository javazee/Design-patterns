package com.example.patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class ProjectStorage {

    private final Map<String, ProjectMemento> projects = new HashMap<>();

    public void store(ProjectMemento project) {
        projects.put(project.getVersion(), project);
    }

    public ProjectMemento load(String version) {
        ProjectMemento project = projects.get(version);
        if (project == null) {
            System.out.println("not found project with version " + version);
            return null;
        } else {
            return project;
        }
    }
}
