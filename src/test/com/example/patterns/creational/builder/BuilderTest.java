package com.example.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void testBuildPC() {
        PC pc = (PC) new PCBuilder().setAccumulator(6000)
                .setDisplay("24 inch")
                .setRAM(16)
                .setWiFi("wifi")
                .setVideoCard("amd")
                .setStorage(512)
                .setDrive("dvd")
                .build();
        Assert.assertTrue(pc.toString().contains("24 inch"));
        Assert.assertTrue(pc.toString().contains("wifi"));
        Assert.assertEquals(16, (int) pc.getRam());
    }

    @Test
    public void testInvalidBuildPC() {
        Assert.assertThrows(RuntimeException.class, () -> new PCBuilder().setAccumulator(6000)
                .setDisplay("24 inch")
                .setRAM(16)
                .setWiFi("wifi")
                .setVideoCard("amd")
                .setStorage(512)
                .build());
    }

    @Test
    public void testInvalidBuildLapTop() {
        RuntimeException exception = Assert.assertThrows(RuntimeException.class, () -> new LapTopBuilder().setAccumulator(6000)
                .setRAM(16)
                .setWiFi("wifi")
                .setVideoCard("amd")
                .setStorage(512)
                .build());
        Assert.assertTrue(exception.getMessage().contains("Display"));
    }
}
