package com.spring.flightproject.service.impl;

import com.spring.flightproject.models.ScheduledFlight;
import com.spring.flightproject.repository.ScheduledFlightRepository;
import com.spring.flightproject.service.ScheduledFlightService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ScheduledFlightServiceImpl implements ScheduledFlightService{
	
	private ScheduledFlightRepository scheduledFlightRepository;
	public ScheduledFlightServiceImpl(ScheduledFlightRepository scheduledFlightRespository) {
		super();
		this.scheduledFlightRepository=scheduledFlightRespository;
	}

	@Override
	public ScheduledFlight saveScheduledFlight(ScheduledFlight ScheduledFlight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduledFlight> getAllScheduledFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScheduledFlight getEmpById(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScheduledFlight updateScheduledFlight(ScheduledFlight ScheduledFlight, long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteScheduledFlight(long Id) {
		// TODO Auto-generated method stub
		
	}
}
