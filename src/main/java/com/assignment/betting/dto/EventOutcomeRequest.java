package com.assignment.betting.dto;

import lombok.Data;

@Data
public class EventOutcomeRequest {
    private String eventId;
    private String eventName;
    private String eventWinnerId;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventWinnerId() {
        return eventWinnerId;
    }

    public void setEventWinnerId(String eventWinnerId) {
        this.eventWinnerId = eventWinnerId;
    }

    public EventOutcomeRequest(String eventId, String eventName, String eventWinnerId) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventWinnerId = eventWinnerId;
    }
}
