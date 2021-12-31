package com.example.assign.database;

import java.util.List;

import com.example.assign.entities.Driver;
import com.example.assign.entities.FavouriteLocations;

public interface FavLocationDB {
	public boolean add (FavouriteLocations favLoc);
	public List<FavouriteLocations> getAllLocations();
	public FavouriteLocations get(String locName);
	public List<Driver> getDrivers(String driverName);

}
