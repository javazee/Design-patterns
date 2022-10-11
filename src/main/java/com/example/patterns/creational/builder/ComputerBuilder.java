package com.example.patterns.creational.builder;

public interface ComputerBuilder {

    ComputerBuilder setRAM(Integer ram);

    ComputerBuilder setStorage(Integer storage);

    ComputerBuilder setVideoCard(String videoCard);

    ComputerBuilder setDisplay(String display);

    ComputerBuilder setWiFi(String wiFi);

    ComputerBuilder setAccumulator(Integer accumulator);

    ComputerBuilder setDrive(String drive);

    Computer build();
}
