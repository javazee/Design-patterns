package com.example.patterns.structural.facade;

import java.util.HashMap;
import java.util.Map;

public class KafkaProducerManager {

    private Map<Integer, KafkaProducer> producers = new HashMap<>();

    public KafkaProducer getProducerById(Integer id) {
        return producers.get(id);
    }

    public void closeProducerById(Integer id) {
        System.out.println("producer is closed...");
        KafkaProducer producer = producers.get(id);
        producer = null;
        producers.remove(id);

    }

    public void addProducer(Integer id) {
        System.out.println("creating new KafkaProducer ...");
        producers.put(id, new KafkaProducer());
    }
}
