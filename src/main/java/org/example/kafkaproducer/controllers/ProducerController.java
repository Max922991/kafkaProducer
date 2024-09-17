package org.example.kafkaproducer.controllers;

import lombok.RequiredArgsConstructor;
import org.example.kafkaproducer.models.Userok;
import org.example.kafkaproducer.service.KafkaSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/producer")
public class ProducerController {

    private final KafkaSender kafkaSender;

    @PostMapping("/send")
    public void send(@RequestBody Userok userok) {
        kafkaSender.send(userok);
    }
}
