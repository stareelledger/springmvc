package com.spring.flightproject.scheduledflight.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.spring.flightproject.flight.entities.Flight;
import com.spring.flightproject.schedule.entities.Schedule;
@Entity
public class Scheduledflight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scheduledFlightId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="flightNumber")
	private Flight flight;
	private int availableSeats;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="scheduleId")
	private Schedule schedule;
	
	public Scheduledflight(int scheduledFlightId, Flight flight, int availableSeats, Schedule schedule) {
		super();
		this.scheduledFlightId = scheduledFlightId;
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}
	
	public Scheduledflight() {
		super();
	}

	public int getScheduledFlightId() {
		return scheduledFlightId;
	}
	public void setScheduledFlightId(int scheduledFlightId) {
		this.scheduledFlightId = scheduledFlightId;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Scheduledflight [scheduledFlightId=" + scheduledFlightId + ", flight=" + flight + ", availableSeats="
				+ availableSeats + ", schedule=" + schedule + "]";
	}
	
}
