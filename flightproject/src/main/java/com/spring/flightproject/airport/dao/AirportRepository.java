package com.spring.flightproject.airport.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.flightproject.airport.entities.Airport;

public interface AirportRepository extends CrudRepository<Airport ,Integer>{

}
