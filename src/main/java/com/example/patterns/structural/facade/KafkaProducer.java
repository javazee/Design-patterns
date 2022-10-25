package com.example.patterns.structural.facade;

public class KafkaProducer {

    public KafkaProducer() {
        System.out.println("kafkaProducer was created");
    }

    public void send(String record) {
        System.out.printf("message [%s] sent...\n", record);
    }
}
