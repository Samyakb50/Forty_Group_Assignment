package com.assignment.betting.event;

import com.assignment.betting.dto.BetSettlementMessage;
import org.springframework.stereotype.Component;

@Component
public class RocketMQProducer {

    public void send(BetSettlementMessage msg){
        System.out.println("Sending to RocketMQ: "+ msg);
    }
}
