package com.example.assign.services;

import java.util.List;

import com.example.assign.entities.Passenger;
import com.example.assign.entities.Ride;

public class PassenegerService implements IPassengerService {

	
	public List getallpassengers() {
		 return  l1.getallpassengers();
		
	}

	
	public Passenger getpassenger(String name) {
		return l1.getpassenger(name);		
	}

	public boolean add(Passenger p) {
		 return l1.add(p);
	}
	
	@Override
	public boolean delete(String name) {
		return l1.delete(name);
	}


	@Override
	public boolean logIn(String email, String password) {
		return l1.logIn(email, password);
	}
	

}
