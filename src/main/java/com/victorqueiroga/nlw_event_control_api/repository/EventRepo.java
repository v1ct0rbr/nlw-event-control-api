package com.victorqueiroga.nlw_event_control_api.repository;

import org.springframework.data.repository.CrudRepository;

import com.victorqueiroga.nlw_event_control_api.model.Event;

public interface EventRepo extends CrudRepository<Event, Integer> {

    public Event findByPrettyName(String prettyName);
}
