package com.example.patterns.structural.facade;

import java.util.List;

public class FacadeClient {

    public static void main(String[] args) {
        KafkaService kafkaService = new KafkaService();
        kafkaService.sendMessages(List.of("Message_1", "Message_2", "Message_3"));
    }
}
