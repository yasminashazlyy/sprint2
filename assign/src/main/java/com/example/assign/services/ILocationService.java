package com.example.assign.services;

import java.util.List;

import com.example.assign.database.FavLocationList;
import com.example.assign.entities.Driver;
import com.example.assign.entities.FavouriteLocations;



public interface ILocationService {
	 FavLocationList FLocList  = new  FavLocationList();

	
	 public boolean add(FavouriteLocations d);
	 public List getAllLocations();
	 public FavouriteLocations get(String locName  );
	 public List<Driver> getDrivers(String driverName);
	public boolean update(FavouriteLocations fL, Driver currentDriver);	 

}
