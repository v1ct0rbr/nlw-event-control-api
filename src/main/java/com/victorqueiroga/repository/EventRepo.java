package com.victorqueiroga.repository;

import org.springframework.data.repository.CrudRepository;

import com.victorqueiroga.model.Event;

public interface EventRepo extends CrudRepository<Event, Integer> {

    public Event findByPrettyName(String prettyName);
}
