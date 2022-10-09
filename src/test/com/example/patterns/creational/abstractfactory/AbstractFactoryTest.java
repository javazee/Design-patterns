package com.example.patterns.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void testFactory() {
        ElectronicFactory electronicFactory = new AppleElectronicsFactory();
        Phone phone = electronicFactory.producePhone();
        Computer computer = electronicFactory.produceComputer();
        TVApp tvApp = electronicFactory.produceTVApp();
        phone.doCall();
        Assert.assertTrue(phone instanceof Iphone);
        Assert.assertTrue(computer instanceof IMac);
        Assert.assertTrue(tvApp instanceof AppleTV);

        electronicFactory = new SamsungElectronicsFactory();
        phone = electronicFactory.producePhone();
        computer = electronicFactory.produceComputer();
        tvApp = electronicFactory.produceTVApp();
        phone.doCall();
        Assert.assertFalse(phone instanceof Iphone);
        Assert.assertTrue(phone instanceof GalaxyPhone);
        Assert.assertTrue(tvApp instanceof SamsungTV);
        Assert.assertNull(computer);
    }
}
