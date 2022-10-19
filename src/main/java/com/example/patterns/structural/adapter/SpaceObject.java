package com.example.patterns.structural.adapter;

public abstract class SpaceObject {
    private String name;
    private Integer distanceFromEarth;

    public SpaceObject(String name, Integer distanceFromEarth) {
        this.name = name;
        this.distanceFromEarth = distanceFromEarth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void setDistanceFromEarth(Integer distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }
}
