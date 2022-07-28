package com.spring.flightproject.service;

import java.util.List;

import com.spring.flightproject.models.ScheduledFlight;

public interface ScheduledFlightService {

	ScheduledFlight saveScheduledFlight(ScheduledFlight scheduledFlight);
	List<ScheduledFlight> getAllScheduledFlights();
	
	// get sepecific ScheduledFlight by Id
	ScheduledFlight getEmpById(long Id);
	
	// update sepecific ScheduledFlight by Id
	ScheduledFlight updateScheduledFlight(ScheduledFlight ScheduledFlight, long Id);
	
	// delete sepecific ScheduledFlight by Id
	void deleteScheduledFlight(long Id);
}
