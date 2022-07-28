package com.spring.flightproject.flight.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.flightproject.flight.entities.Flight;

public interface FlightRepository extends CrudRepository<Flight ,Integer>{

}
