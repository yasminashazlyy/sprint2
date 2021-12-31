package com.example.assign.services;

import java.util.List;

import com.example.assign.database.DriverList;
import com.example.assign.entities.Driver;
import com.example.assign.entities.Ride;
import com.example.assign.entities.FavouriteLocations;

public interface IDriverService {
	DriverList l1 = new DriverList();
	
	 public boolean add(Driver d);
	 public List getalldrivers( );
	 public Driver getdriver(String name  );
	 public boolean delete (String name  );
	 public boolean addToDriverFavLocationList(FavouriteLocations dFavLocations);
	 public List getDriverFavouriteAreas(String name);
	 public boolean logIn(String email , String password);
	/* public boolean update (Driver d ,FavouriteLocations f);
	 public List <Driver> getPendingDriverList();
	 public List<Ride> getRides(String name);
	 public List<FavouriteLocations> getFavLocation(String name);
	 */
	public List<Driver> getPendingDriverList();

}
