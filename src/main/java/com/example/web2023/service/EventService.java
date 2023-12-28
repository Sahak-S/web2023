package com.example.web2023.service;

import com.example.web2023.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
}
