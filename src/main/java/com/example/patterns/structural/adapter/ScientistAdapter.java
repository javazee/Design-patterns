package com.example.patterns.structural.adapter;

public class ScientistAdapter implements Telescope {

    private final Scientist scientist;

    public ScientistAdapter(Scientist scientist) {
        this.scientist = scientist;
    }

    @Override
    public void exploreSpaceObject(SpaceObject spaceObject) {
        System.out.printf("%s is being explored by %s\n", spaceObject.getName(), scientist.getName());
        scientist.explore();
    }
}
