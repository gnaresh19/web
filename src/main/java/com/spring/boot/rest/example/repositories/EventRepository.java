package com.spring.boot.rest.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.rest.example.model.Event;

public interface EventRepository extends CrudRepository<Event, Integer> {

}
