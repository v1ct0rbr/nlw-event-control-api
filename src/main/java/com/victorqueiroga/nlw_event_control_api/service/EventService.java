package com.victorqueiroga.nlw_event_control_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorqueiroga.nlw_event_control_api.model.Event;
import com.victorqueiroga.nlw_event_control_api.repository.EventRepo;
import com.victorqueiroga.nlw_event_control_api.utils.Functions;

@Service
public class EventService {

    @Autowired
    private EventRepo eventRepo;

    public Event addNewEvent(Event event) {
        //gerando 
        event.setPrettyName(Functions.prettyName(event.getTitle()));
        return eventRepo.save(event);
    }

    public List<Event> findAllEvents() {
        return (List<Event>) eventRepo.findAll();
    }

    public Event findEventById(Integer eventId) {
        return eventRepo.findById(eventId).get();
    }

    public Event getByPrettyName (String prettyName) {
        return eventRepo.findByPrettyName(prettyName);
    }

}
