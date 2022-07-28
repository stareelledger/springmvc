package com.spring.flightproject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.spring.flightproject.models.Airport;
import com.spring.flightproject.repository.AirportRepository;
import com.spring.flightproject.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService{
private AirportRepository airportRepository;
	
	public AirportServiceImpl(AirportRepository airportRepository) {
		super();
		this.airportRepository=airportRepository;
	}

	@Override
	public Airport saveAirport(Airport airport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> getAllAirports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Airport getEmpById(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Airport updateAirport(Airport Airport, long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAirport(long Id) {
		// TODO Auto-generated method stub
		
	}
}
