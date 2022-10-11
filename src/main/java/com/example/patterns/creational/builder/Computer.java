package com.example.patterns.creational.builder;

public class Computer {
    private Integer ram;
    private Integer storage;
    private String videoCard;
    private String display;
    private String wifi;
    private Integer accumulator;
    private String drive;

    public Computer(Integer ram, Integer storage, String videoCard, String display, String wifi, Integer accumulator, String drive) {
        this.ram = ram;
        this.storage = storage;
        this.videoCard = videoCard;
        this.display = display;
        this.wifi = wifi;
        this.accumulator = accumulator;
        this.drive = drive;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public Integer getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(Integer accumulator) {
        this.accumulator = accumulator;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", videoCard='" + videoCard + '\'' +
                ", display='" + display + '\'' +
                ", wifi='" + wifi + '\'' +
                ", accumulator=" + accumulator +
                ", drive='" + drive + '\'' +
                '}';
    }
}
