package com.example.patterns.creational.builder;

public class LapTopBuilder implements ComputerBuilder{
    private Integer ram;
    private Integer storage;
    private String videoCard;
    private String display;
    private String wifi;
    private Integer accumulator;
    private String drive;

    @Override
    public ComputerBuilder setRAM(Integer ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setVideoCard(String videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    @Override
    public ComputerBuilder setDisplay(String display) {
        this.display = display;
        return this;
    }

    @Override
    public ComputerBuilder setWiFi(String wiFi) {
        this.wifi = wiFi;
        return this;
    }

    @Override
    public ComputerBuilder setAccumulator(Integer accumulator) {
        this.accumulator = accumulator;
        return this;
    }

    @Override
    public ComputerBuilder setDrive(String drive) {
        this.drive = drive;
        return this;
    }

    @Override
    public Computer build() {
        if (accumulator == null) {
            throw new RuntimeException("Accumulator can't be null");
        } else if (display == null) {
            throw new RuntimeException("Display can't be null");
        } else if (wifi == null) {
            throw new RuntimeException("WiFi can't be null");
        }
        return new PC(ram, storage, videoCard, display, wifi, accumulator, drive);
    }
}
