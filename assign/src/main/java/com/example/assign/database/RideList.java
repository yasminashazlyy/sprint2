package com.example.assign.database;

import java.util.ArrayList;
import java.util.List;

import com.example.assign.entities.Ride;

public class RideList implements RideDB {
	private static List<Ride> rides = new ArrayList<Ride>();

	public int getNextId() {
		 return rides.size();
	}

	public boolean add(Ride ride) {
		return rides.add(ride);
	}

	public Ride get(int id) {
		 for (Ride ride : rides) {
	            if (ride.getId() == id) {
	                return ride;
	            }
	        }

	        return null;
	}

	public List<Ride> getAll() {
		return rides;
	}

	
	public boolean delete(int id) {
		for (Ride ride : rides) {
            if (ride.getId() == id) {
                return rides.remove(ride);
            }
        }

        return false;
	}

}
