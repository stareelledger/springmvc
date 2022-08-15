package com.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.schedule.entity.Airport;
import com.schedule.entity.Schedule;
import com.schedule.entity.ScheduleRequestResponse;
import com.schedule.service.ScheduleService;



@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	@Autowired
	private ScheduleService scheduleService;
	@Autowired
	private RestTemplate restTemplate;
	public ScheduleController(ScheduleService scheduleService) {
		super();
		this.scheduleService= scheduleService;
	}
	
	

    @PostMapping("/save")
    public ScheduleRequestResponse saveSchedule(@RequestBody ScheduleRequestResponse scheduleRequestResponse){
    	Airport sourceAirport=new Airport();
    	Airport destinationAirport=new Airport();
    	
    	sourceAirport=restTemplate.postForObject("http://localhost:8000/airport/save",scheduleRequestResponse.getSourceAirport(),Airport.class);
    	
    	destinationAirport=restTemplate.postForObject("http://localhost:8000/airport/save",scheduleRequestResponse.getDestinationAirport(),Airport.class);
    	
    	Schedule schedule=new Schedule();
    	schedule.setSourceAirportId(sourceAirport.getAirportId());
    	schedule.setDestinationAirportId(destinationAirport.getAirportId());
    	schedule.setArrivalTime(scheduleRequestResponse.getArrivalTime());
    	schedule.setDepartureTime(scheduleRequestResponse.getDepartureTime());
    	
    	
    	schedule=scheduleService.saveSchedule(schedule);
    	return new ScheduleRequestResponse(schedule.getScheduleId(),sourceAirport,destinationAirport,schedule.getArrivalTime(),schedule.getDepartureTime());
    }
    
}
