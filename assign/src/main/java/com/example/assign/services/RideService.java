package com.example.assign.services;

import java.util.List;

import com.example.assign.*;
import com.example.assign.database.FavLocationList;
import com.example.assign.database.RideDB;
import com.example.assign.database.RideList;
import com.example.assign.entities.FavouriteLocations;
import com.example.assign.entities.Ride;

public class RideService implements IRideService{
	 private RideDB DB = new RideList();
	 //public ILocationService locService = new LocationService();
	 public LocationService locService = new LocationService();
	

	    @Override
	    public boolean add(Ride ride) {
	    	String pickUpLocation = ride.getPickUp();
	    	FavouriteLocations targetedLocation = locService.get(pickUpLocation);
	    	if (targetedLocation!= null)
	    	{
	    		targetedLocation.notifyObservers(ride);
	    	}
	    	System.out.println("Ride"+DB.getNextId()+"has "+ ride.getRideRequester()+"as a passenger");
	        return DB.add(ride);
	    }

	    @Override
	    public Ride get(int id) {
			return null;
	       
	    }

	    @Override
	    public List<Ride> getAll() {
	        return DB.getAll();
	    }

	    @Override
	    public boolean delete(int id) {
	       	        return false;
	    }


}
