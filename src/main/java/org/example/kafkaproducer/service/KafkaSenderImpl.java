package org.example.kafkaproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.kafkaproducer.models.Userok;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaSenderImpl implements KafkaSender {

    private final KafkaTemplate<String, Userok> kafkaTemplate;

    @Override
    public void send(Userok userok) {
        if (userok == null) {
            log.warn("Attempted to send a null Userok object");
            return;
        }
        try {
            log.info("Отправка Userok: {}", userok);
            kafkaTemplate.send("topic-1", userok);
            log.info("Userok отправлен в kafka");
        } catch (Exception e) {
            log.error("Ошибка отправки Userok: {}", e.getMessage());
        }
    }
}