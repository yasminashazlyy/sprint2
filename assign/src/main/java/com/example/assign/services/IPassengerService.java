package com.example.assign.services;

import java.util.List;

import com.example.assign.database.PassengerList;
import com.example.assign.entities.Passenger;

public interface IPassengerService {
	PassengerList l1 = new PassengerList();

	public List getallpassengers();
	public Passenger getpassenger(String name);
	public boolean add(Passenger p);
	public boolean delete(String name);
	public boolean logIn(String email , String password);
}
