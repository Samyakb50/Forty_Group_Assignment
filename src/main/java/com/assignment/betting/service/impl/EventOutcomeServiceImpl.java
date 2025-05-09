package com.assignment.betting.service.impl;

import com.assignment.betting.dto.EventOutcomeRequest;
import com.assignment.betting.dto.EventOutcomeResponse;
import com.assignment.betting.event.KafkaProducer;
import com.assignment.betting.service.EventOutcomeService;

import org.springframework.stereotype.Service;

@Service
public class EventOutcomeServiceImpl implements EventOutcomeService {
    private final KafkaProducer kafkaProducer;

    public EventOutcomeServiceImpl(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @Override
    public EventOutcomeResponse publishOutcome(EventOutcomeRequest request) {
        kafkaProducer.sendEventOutcome(request);
        return new EventOutcomeResponse("Published");
    }
}
