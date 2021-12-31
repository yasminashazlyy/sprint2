package com.example.assign.services;

import java.util.List;

import com.example.assign.database.DriverList;
import com.example.assign.entities.Driver;
import com.example.assign.entities.FavouriteLocations;
import com.example.assign.entities.Ride;

public class Driverservice  implements IDriverService{
	 
	 public boolean add(Driver d)
	 {  
		 return l1.add(d);
	 }
	
	 public List getalldrivers( )
	 {    
		  return  l1.getalldrivers();
	 }
	 
	 public Driver getdriver(String name)
	 {    
		  return l1.getdriver(name);
	 }

	public boolean delete(String name) {
		return l1.delete(name);
	}

	@Override
	public boolean addToDriverFavLocationList(FavouriteLocations dFavLocations) {
		return l1.addToDriverFavLocationList(dFavLocations);
	}
	
	public List getDriverFavouriteAreas(String name)
	 {
		return l1.getDriverFavouriteAreas(name);
		
	 }
	
	@Override
	public List<Driver> getPendingDriverList() {
		
		return l1.getPendingDriverList();
	}

	@Override
	public boolean logIn(String email , String password) {
		return l1.logIn(email, password);
	     
		}

	/*public boolean update(Driver d, FavouriteLocations f) {
	return l1.update(d,f);
    }
    
	public List<Ride> getRides(String name) {
		return l1.getRides(name);
	}

*/
}
