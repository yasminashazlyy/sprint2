package com.example.assign.database;

import java.util.List;

import com.example.assign.entities.Ride;

public interface RideDB {
	
	 public int getNextId();
	 boolean add(Ride ride);
     public Ride get(int id);
     public List<Ride> getAll();
     boolean delete(int id);

}
