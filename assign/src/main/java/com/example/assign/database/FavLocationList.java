package com.example.assign.database;

import java.util.ArrayList;
import java.util.List;

import com.example.assign.entities.Driver;
import com.example.assign.entities.FavouriteLocations;

public class FavLocationList implements FavLocationDB{
	
	private static List<FavouriteLocations> locations = new ArrayList<FavouriteLocations>();

	@Override
	public boolean add(FavouriteLocations favLoc) {
		return locations.add(favLoc);
	}

	@Override
	public List<FavouriteLocations> getAllLocations() {
		return locations;
	}

	@Override
	public FavouriteLocations get(String locName) {
		 for (FavouriteLocations location : locations) {
	            if (location.getName().compareTo(locName)==0) {
	                return location;
	            }
	        }
          return null;
	}

	@Override
	public List<Driver> getDrivers(String driverName) {
		FavouriteLocations dLocation = this.get(driverName);
		return  dLocation.getdFavArea();
	}
	
	public boolean update(FavouriteLocations target ,Driver DSubscriber)
	{
		for (FavouriteLocations Loc :locations)
		{
			if(Loc.getName()== target.getName())
			{
				return Loc.registerObserver(DSubscriber);
			}
		}
		return this.add(target);
	}
	
	public boolean delete(String name) {
		for (FavouriteLocations location : locations) {
            if (name.compareTo(location.getName())==0) {
                return locations.remove(location);
            }
        }
        return false;
	}
	

}
