package org.example.kafkaproducer.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.stereotype.Component;

@Component
public class CustomSerializer implements Serializer<Userok> {

    private final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public byte[] serialize(String s, Userok userok) {
        try {
            if (userok == null) {
                System.out.println("Null received at serializing");
                return null;
            }
            System.out.println("Serializing...");
            return objectMapper.writeValueAsBytes(userok);
        } catch (Exception e) {
            throw new SerializationException("Error when serializing Userok to byte[]");
        }
    }
}
