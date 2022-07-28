package com.spring.flightproject.service.impl;

import com.spring.flightproject.models.Passenger;
import com.spring.flightproject.repository.PassengerRepository;
import com.spring.flightproject.service.PassengerService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class PassengerServiceImpl implements PassengerService {
private PassengerRepository passengerRepository;
	
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository=passengerRepository;
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger getEmpById(long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger updatePassenger(Passenger Passenger, long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePassenger(long Id) {
		// TODO Auto-generated method stub
		
	}
}
