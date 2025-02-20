package com.victorqueiroga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.victorqueiroga.model.Event;
import com.victorqueiroga.service.EventService;


@RestController

public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public Event addNewEvent (@RequestBody Event event) {
        return eventService.addNewEvent(event);
    }
    


}
