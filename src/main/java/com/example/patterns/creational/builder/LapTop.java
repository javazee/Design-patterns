package com.example.patterns.creational.builder;

public class LapTop extends Computer{

    public LapTop(Integer ram,
                  Integer storage,
                  String videoCard,
                  String display,
                  String wifi,
                  Integer accumulator,
                  String drive) {
        super(ram, storage, videoCard, display, wifi, accumulator, drive);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
