package com.spring.flightproject.schedule.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.flightproject.schedule.entities.Schedule;

public interface ScheduleRepository extends CrudRepository<Schedule ,Integer>{

}
