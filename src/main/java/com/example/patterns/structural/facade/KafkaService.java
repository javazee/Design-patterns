package com.example.patterns.structural.facade;

import java.util.List;

public class KafkaService {
    private KafkaProducerManager manager = new KafkaProducerManager();
    private TransactionManager transactionManager = new TransactionManager();
    private RecordValidator validator = new RecordValidator();


    public void sendMessages (List<String> records) {
        manager.addProducer(1);
        KafkaProducer kafkaProducer = manager.getProducerById(1);
        transactionManager.initTransactions();
        transactionManager.beginTransaction();
        records.forEach(kafkaProducer::send);
        transactionManager.flush();
        transactionManager.commitTransaction();
        transactionManager.closeTransaction();
        manager.closeProducerById(1);
    }
}
