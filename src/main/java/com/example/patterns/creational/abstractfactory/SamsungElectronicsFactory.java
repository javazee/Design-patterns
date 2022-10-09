package com.example.patterns.creational.abstractfactory;

public class SamsungElectronicsFactory implements ElectronicFactory{
    @Override
    public Phone producePhone() {
        return new GalaxyPhone();
    }

    @Override
    public TVApp produceTVApp() {
        return new SamsungTV();
    }

    @Override
    public Computer produceComputer() {
        return null;
    }
}
