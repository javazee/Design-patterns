package com.example.patterns.behavioral.memento;

public class MementoRunner {
    public static void main(String[] args) throws InterruptedException {
        ProjectStorage projectStorage = new ProjectStorage();

        Project project = new Project("1.0", "Zakharyev Eduard", "java code");
        System.out.println("creating new project - version " + project.getVersion());
        System.out.println(project);
        ProjectMemento projectMemento = project.snapshot();
        System.out.println("saving project " + project.getVersion() + " in storage");
        projectStorage.store(projectMemento);

        Thread.sleep(3000);
        project = new Project("1.1", "Zakharyev Eduard", "java code + sql");
        System.out.println("\ncreating new project - version " + project.getVersion());
        System.out.println(project);
        ProjectMemento projectMemento1 = project.snapshot();
        System.out.println("saving project " + project.getVersion() + " in storage");
        projectStorage.store(projectMemento);

        System.out.println("\nSomething wrong happened...Let's restore version 1.0");
        ProjectMemento projectMemento2 = projectStorage.load("1.0");
        project.load(projectMemento2);
        System.out.println(project);



    }
}
