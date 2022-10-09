package com.example.patterns.creational.abstractfactory;

public class AppleElectronicsFactory implements ElectronicFactory{
    @Override
    public Phone producePhone() {
        return new Iphone();
    }

    @Override
    public TVApp produceTVApp() {
        return new AppleTV();
    }

    @Override
    public Computer produceComputer() {
        return new IMac();
    }
}
