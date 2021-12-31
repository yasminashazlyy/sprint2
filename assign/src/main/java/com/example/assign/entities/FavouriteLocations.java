package com.example.assign.entities;

import java.util.ArrayList;
import java.util.List;

import com.example.assign.observers.LocationSubject;

public class FavouriteLocations implements LocationSubject {
	private String name;
	public List<Driver> dFavArea= new ArrayList<Driver>();
	
	 public FavouriteLocations()
	  {
		  super();
		  this.name=name;
		  this.dFavArea= new ArrayList<Driver>();
	  }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setdFavArea(List<Driver> dFavArea) 
	{
		this.dFavArea = dFavArea;
	}	
	public List<Driver> getdFavArea()
	{
		return dFavArea;
	}

	@Override
	public boolean registerObserver(Driver d) {
		return dFavArea.add(d);
	}

	@Override
	public boolean removeObserver(Driver d) {
		return dFavArea.remove(d);
	}

	@Override
	public void notifyObservers(Ride requestedRide) {
		for (Driver d : dFavArea) {
			if(d!=null)
	        d.update(this.name);
	       }	
	}
	
}
