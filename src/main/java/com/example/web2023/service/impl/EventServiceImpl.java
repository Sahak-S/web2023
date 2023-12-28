package com.example.web2023.service.impl;

import com.example.web2023.dto.EventDto;
import com.example.web2023.model.Club;
import com.example.web2023.model.Event;
import com.example.web2023.repository.ClubRepository;
import com.example.web2023.repository.EventRepository;
import com.example.web2023.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;
    private ClubRepository clubRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
        this.eventRepository = eventRepository;
        this.clubRepository = clubRepository;
    }


    @Override
    public void createEvent(Long clubId, EventDto eventDto) {
        Club club = clubRepository.findById(clubId).get();
        Event event = mapToEvent(eventDto);
        event.setClub(club);
        eventRepository.save(event);
    }

    private Event mapToEvent(EventDto eventDto) {
        return Event.builder()
                .id(eventDto.getId())
                .name(eventDto.getName())
                .startTime(eventDto.getStartTime())
                .endTime(eventDto.getEndTime())
                .type(eventDto.getType())
                .photoUrl(eventDto.getPhotoUrl())
                .createdOn(eventDto.getCreatedOn())
                .updatedOn(eventDto.getUpdatedOn())
                .build();
    }
}
