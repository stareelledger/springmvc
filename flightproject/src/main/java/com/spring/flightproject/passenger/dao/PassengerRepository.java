package com.spring.flightproject.passenger.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.flightproject.passenger.entities.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger ,Integer> {

}
