package com.assignment.betting.service;

import com.assignment.betting.dto.EventOutcomeRequest;
import com.assignment.betting.dto.EventOutcomeResponse;
import com.assignment.betting.event.KafkaProducer;
import com.assignment.betting.service.impl.EventOutcomeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EventOutcomeServiceTest {
    @Mock
    KafkaProducer producer;

    @InjectMocks
    EventOutcomeServiceImpl service;

    @Test
    void testPublishOutcome() {
        EventOutcomeRequest request = new EventOutcomeRequest("1", "Match1", "TeamA");
        EventOutcomeResponse response = service.publishOutcome(request);
        assertEquals("Published", response.getStatus());
        verify(producer).sendEventOutcome(request);
    }
}