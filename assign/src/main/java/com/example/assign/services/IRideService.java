package com.example.assign.services;

import java.util.List;

import com.example.assign.entities.*;

public interface IRideService {
	  
	boolean add(Ride ride);
    Ride get(int id);
    List<Ride> getAll();
    boolean delete(int id);

}
