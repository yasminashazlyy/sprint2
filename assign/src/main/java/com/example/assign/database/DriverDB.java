package com.example.assign.database;

import java.util.ArrayList;
import java.util.List;

import com.example.assign.entities.Driver;
import com.example.assign.entities.FavouriteLocations;
import com.example.assign.entities.Ride;

public interface DriverDB {
	
	 public boolean add(Driver d);
	 public List getalldrivers( );
	 public Driver getdriver(String name );
	 public boolean delete(String name);
	 public boolean logIn(String email , String password);
	 public boolean addToDriverFavLocationList(FavouriteLocations dFavLocations);
	 public List getDriverFavouriteAreas(String name);
	 public List getPendingDriverList();
	 
	 /*public boolean update(Driver d, FavouriteLocations f); 
   	 public List<Ride> getRides(String name);
	 public List<FavouriteLocations> getDFavLocation(String name);
	 */
	 
}
