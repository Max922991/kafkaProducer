package org.example.kafkaproducer.service;

import org.example.kafkaproducer.models.Userok;

public interface KafkaSender {

    void send(Userok userok);
}
