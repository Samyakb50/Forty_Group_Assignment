package com.assignment.betting.service;

import com.assignment.betting.dto.EventOutcomeRequest;

public interface BetSettlementService {
    void handleEventOutcome(EventOutcomeRequest outcome);
}
