package com.spring.flightproject.schedule.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.spring.flightproject.airport.entities.Airport;
@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scheduleId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="airportId")
	private Airport sourceAirport;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="airportId2")
	private Airport destinationAirport;
	private String arrivalTime;
	private BigDecimal departureTime;
	public Schedule(int scheduleId, Airport sourceAirport, Airport destinationAirport, String arrivalTime,
			BigDecimal departureTime) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	public Schedule() {
		super();
	}
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Airport getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public BigDecimal getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(BigDecimal departureTime) {
		this.departureTime = departureTime;
	}
	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", sourceAirport=" + sourceAirport + ", destinationAirport="
				+ destinationAirport + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}
	
}
