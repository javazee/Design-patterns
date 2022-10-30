package com.example.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class ProxyClient {

    public static void main(String[] args) {
        UnsafeRunner unsafeRunner = new UnsafeRunner();
        ArrayList<Future<Void>> tasks = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            tasks.add(CompletableFuture.runAsync(unsafeRunner::run));
        }
        boolean isCompleted = false;

        while (!isCompleted) {
            if (tasks.stream().allMatch(Future::isDone)) {
                System.out.println("result from unsafe object: " + unsafeRunner.getCount());
                isCompleted = true;
            }
        }

        ProxySafeRunner proxySafeRunner = new ProxySafeRunner();
        tasks.clear();
        for (int i = 0; i < 1000000; i++) {
            tasks.add(CompletableFuture.runAsync(proxySafeRunner::run));
        }
        isCompleted = false;

        while (!isCompleted) {
            if (tasks.stream().allMatch(Future::isDone)) {
                System.out.println("result from safe proxy object: " + proxySafeRunner.getCount());
                isCompleted = true;
            }
        }

    }
}
