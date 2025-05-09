package com.assignment.betting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BetSettlementMessage {
    private String betId;
    private String userId;
    private String eventId;
    private boolean isWinningBet;

    public String getBetId() {
        return betId;
    }

    public void setBetId(String betId) {
        this.betId = betId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public boolean isWinningBet() {
        return isWinningBet;
    }

    public void setWinningBet(boolean winningBet) {
        isWinningBet = winningBet;
    }

    public BetSettlementMessage(String betId, String userId, String eventId, boolean isWinningBet) {
        this.betId = betId;
        this.userId = userId;
        this.eventId = eventId;
        this.isWinningBet = isWinningBet;
    }
}
