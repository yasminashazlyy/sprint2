package com.example.assign.database;

import java.util.List;

import com.example.assign.entities.Passenger;

public interface PassengerDB {
	public boolean add(Passenger d);
	 public List getallpassengers( );
	 public Passenger getpassenger(String name );
	 public boolean delete(String name);
	 public boolean logIn(String email , String password);
	 

}
