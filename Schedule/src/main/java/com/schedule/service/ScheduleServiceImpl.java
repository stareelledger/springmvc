package com.schedule.service;


import com.schedule.entity.Schedule;
import com.schedule.repository.ScheduleRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ScheduleServiceImpl implements ScheduleService{
	@Autowired
	ScheduleRepository scheduleRepository;
	

	@Override
	public Schedule saveSchedule(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}




}
