package com.example.patterns.creational.singleton;


import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void getInstanceTest() {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        Assert.assertEquals(simpleSingleton, SimpleSingleton.getInstance());

        LazySingleton lazySingleton = LazySingleton.getInstance();
        Assert.assertEquals(lazySingleton, LazySingleton.getInstance());

        LazySynchronizedSingleton lazySynchronizedSingleton = LazySynchronizedSingleton.getInstance();
        Assert.assertEquals(lazySynchronizedSingleton, LazySynchronizedSingleton.getInstance());

        DoubleCheckingSingleton doubleCheckingSingleton = DoubleCheckingSingleton.getInstance();
        Assert.assertEquals(doubleCheckingSingleton, DoubleCheckingSingleton.getInstance());

        StoredSingleton storedSingleton = StoredSingleton.getInstance();
        Assert.assertEquals(storedSingleton, StoredSingleton.getInstance());
    }
}
