package com.example.assign.entities;
 

import java.util.ArrayList;
import java.util.List;

import com.example.assign.observers.LocationObserver;

public class Driver extends User implements LocationObserver{
	public String license, nationalID;
	public boolean verified;
	public Driver()
	{
		
		this.license=license;
		this.nationalID=nationalID;
	}
	
	private List <FavouriteLocations> driverFavLocationList = new ArrayList<FavouriteLocations>();
	private List <Ride> availableRides = new ArrayList<Ride>();
	
	
	public List<Ride> getAvailableRides() {
		return availableRides;
	}

	public void setAvailableRides(Ride ride) {
		availableRides.add(ride);
	}

	public void setFavouriteLocations(FavouriteLocations FL) {
	
		driverFavLocationList.add(FL);	
		}

	@Override
	public void update(String name) {
		// TODO Auto-generated method stub
		
	} 
	

	
	 
}
	
	
 


