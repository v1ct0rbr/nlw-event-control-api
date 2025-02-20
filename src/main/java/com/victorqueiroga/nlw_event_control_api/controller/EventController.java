package com.victorqueiroga.nlw_event_control_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.victorqueiroga.nlw_event_control_api.model.Event;
import com.victorqueiroga.nlw_event_control_api.service.EventService;




@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    
    // get all events e return a list of events in json format
    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return eventService.findAllEvents();
    }
    

    @PostMapping("/events")
    public Event addNewEvent (@RequestBody Event event) {
        return eventService.addNewEvent(event);
    }

    // get by pretty name
    @GetMapping("/events/{prettyName}")
    public ResponseEntity<Event> getEventByPrettyName(@PathVariable String prettyName) {
        Event evt = eventService.getByPrettyName(prettyName);
        if (evt == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(evt);
    }
    
}
