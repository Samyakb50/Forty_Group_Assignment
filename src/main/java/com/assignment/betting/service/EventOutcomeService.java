package com.assignment.betting.service;

import com.assignment.betting.dto.EventOutcomeRequest;
import com.assignment.betting.dto.EventOutcomeResponse;

public interface EventOutcomeService {
    EventOutcomeResponse publishOutcome(EventOutcomeRequest request);
}
