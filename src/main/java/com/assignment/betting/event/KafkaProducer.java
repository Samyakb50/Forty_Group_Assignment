package com.assignment.betting.event;

import com.assignment.betting.dto.EventOutcomeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, EventOutcomeRequest> kafkaTemplate;

    public void sendEventOutcome(EventOutcomeRequest request) {
        kafkaTemplate.send("event-outcomes", request);
    }
}