package com.example.patterns.structural.proxy;

public class UnsafeRunner implements Runner{

    private Integer count = 0;


    @Override
    public void run() {
        count++;
    }

    public Integer getCount() {
        return count;
    }
}
