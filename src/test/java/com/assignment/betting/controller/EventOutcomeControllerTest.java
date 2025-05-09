package com.assignment.betting.controller;

import com.assignment.betting.dto.EventOutcomeRequest;
import com.assignment.betting.dto.EventOutcomeResponse;
import com.assignment.betting.service.EventOutcomeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// Import your own classes



@WebMvcTest(EventOutcomeController.class)
class EventOutcomeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EventOutcomeService service;

    @Test
    void testPublishEndpoint() throws Exception {
        EventOutcomeRequest req = new EventOutcomeRequest("1", "Match", "TeamA");
        when(service.publishOutcome(any())).thenReturn(new EventOutcomeResponse("Published"));

        mockMvc.perform(post("/api/outcomes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(req)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("Published"));
    }
}