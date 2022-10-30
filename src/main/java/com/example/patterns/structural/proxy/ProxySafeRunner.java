package com.example.patterns.structural.proxy;

public class ProxySafeRunner implements Runner{
    UnsafeRunner unsafeRunner;

    public ProxySafeRunner() {
        unsafeRunner = new UnsafeRunner();
    }

    @Override
    public void run() {
        synchronized (unsafeRunner) {
            unsafeRunner.run();
        }
    }

    public Integer getCount() {
        return unsafeRunner.getCount();
    }
}
