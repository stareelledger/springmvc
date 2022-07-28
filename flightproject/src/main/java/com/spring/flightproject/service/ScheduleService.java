package com.spring.flightproject.service;

import java.util.List;

import com.spring.flightproject.models.Schedule;

public interface ScheduleService {

	Schedule saveSchedule(Schedule schedule); 
	
	List<Schedule> getAllSchedules();
	
	// get sepecific Schedule by Id
	Schedule getEmpById(long Id);
	
	// update sepecific Schedule by Id
	Schedule updateSchedule(Schedule schedule, long Id);
	
	// delete sepecific Schedule by Id
	void deleteSchedule(long Id);
}
