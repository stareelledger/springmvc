package com.airport.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.entity.Airport;
import com.airport.repository.AirportRepository;
@Service
public class AirportServiceImpl implements AirportService{

		@Autowired
		private AirportRepository airportRepository;


	@Override
	public Airport saveAirport(Airport airport) {
		return airportRepository.save(airport);
		
	}


}
