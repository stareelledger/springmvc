package com.spring.flightproject.service.impl;

import com.spring.flightproject.models.Schedule;
import com.spring.flightproject.repository.ScheduleRepository;
import com.spring.flightproject.service.ScheduleService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ScheduleServiceImpl implements ScheduleService{
private ScheduleRepository scheduleRepository;
	
	public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
		super();
		this.scheduleRepository=scheduleRepository;
	}

	@Override
	public Schedule saveSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Schedule> getAllSchedules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule getEmpById(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule updateSchedule(Schedule schedule, long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSchedule(long Id) {
		// TODO Auto-generated method stub
		
	}
}
