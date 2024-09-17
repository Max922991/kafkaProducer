package org.example.kafkaproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaSenderImpl implements KafkaSender {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void send(Object o) {
        kafkaTemplate.send("topic-1", o);
    }
}
