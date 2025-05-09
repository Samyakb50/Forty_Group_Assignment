package com.assignment.betting.service.impl;

import com.assignment.betting.dto.BetSettlementMessage;
import com.assignment.betting.dto.EventOutcomeRequest;
import com.assignment.betting.entity.Bet;
import com.assignment.betting.event.RocketMQProducer;
import com.assignment.betting.repository.BetRepository;
import com.assignment.betting.service.BetSettlementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetSettlementServiceImpl implements BetSettlementService {
    private final BetRepository betRepository;
    private final RocketMQProducer rocketMQProducer;

    public BetSettlementServiceImpl(BetRepository betRepository, RocketMQProducer rocketMQProducer) {
        this.betRepository = betRepository;
        this.rocketMQProducer = rocketMQProducer;
    }

    @Override
    public void handleEventOutcome(EventOutcomeRequest outcome) {
        List<Bet> bets = betRepository.findByEventId(outcome.getEventId());
        for (Bet bet : bets) {
            boolean isWinning = bet.getEventWinnerId().equals(outcome.getEventWinnerId());
            BetSettlementMessage msg = new BetSettlementMessage(
                    bet.getBetId(), bet.getUserId(), bet.getEventId(), isWinning
            );
            rocketMQProducer.send(msg);
        }
    }
}
