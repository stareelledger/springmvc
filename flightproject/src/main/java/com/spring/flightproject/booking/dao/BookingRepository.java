package com.spring.flightproject.booking.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.flightproject.booking.entities.Booking;

public interface BookingRepository extends CrudRepository<Booking,Integer> {

}
