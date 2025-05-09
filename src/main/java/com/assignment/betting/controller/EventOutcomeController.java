package com.assignment.betting.controller;

import com.assignment.betting.dto.EventOutcomeRequest;
import com.assignment.betting.dto.EventOutcomeResponse;
import com.assignment.betting.service.EventOutcomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/outcomes")
public class EventOutcomeController {
    private final EventOutcomeService service;

    public EventOutcomeController(EventOutcomeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EventOutcomeResponse> publish(@RequestBody EventOutcomeRequest request) {
        return ResponseEntity.ok(service.publishOutcome(request));
    }
}
