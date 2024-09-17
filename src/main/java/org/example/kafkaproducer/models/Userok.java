package org.example.kafkaproducer.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class Userok implements Serializable {

    private Long id;
    private String name;
}
