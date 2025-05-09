package com.assignment.betting.event;

import com.assignment.betting.dto.EventOutcomeRequest;
import com.assignment.betting.service.BetSettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @Autowired
    private BetSettlementService settlementService;

    @KafkaListener(topics = "event-outcomes", groupId = "bet-group")
    public void consume(EventOutcomeRequest request) {
        settlementService.handleEventOutcome(request);
    }
}