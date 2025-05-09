package com.assignment.betting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bet {
    @Id
    private String betId;
    private String userId;
    private String eventId;
    private String eventMarketId;
    private String eventWinnerId;
    private double betAmount;

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

    public String getEventMarketId() {
        return eventMarketId;
    }

    public void setEventMarketId(String eventMarketId) {
        this.eventMarketId = eventMarketId;
    }

    public String getEventWinnerId() {
        return eventWinnerId;
    }

    public void setEventWinnerId(String eventWinnerId) {
        this.eventWinnerId = eventWinnerId;
    }

    public double getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(double betAmount) {
        this.betAmount = betAmount;
    }
}
