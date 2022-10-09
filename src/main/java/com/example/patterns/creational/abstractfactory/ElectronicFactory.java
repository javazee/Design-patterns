package com.example.patterns.creational.abstractfactory;

public interface ElectronicFactory {

    Phone producePhone();

    TVApp produceTVApp();

    Computer produceComputer();
}
