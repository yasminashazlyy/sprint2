package com.example.assign.services;

import java.util.List;

import com.example.assign.entities.Driver;
import com.example.assign.entities.FavouriteLocations;

public class LocationService implements ILocationService {

	@Override
	public boolean add(FavouriteLocations favLoc) {
		return FLocList.add(favLoc);
	}

	@Override
	public List<FavouriteLocations> getAllLocations() {
		return FLocList.getAllLocations();
	}

	@Override
	public  FavouriteLocations get(String locName) {
		return FLocList.get(locName);
	}

	@Override
	public List<Driver> getDrivers(String driverName) {
		FavouriteLocations dLocation = this.get(driverName);
		return  dLocation.getdFavArea();
	}

	@Override
	public boolean update(FavouriteLocations target ,Driver DSubscriber)
	{
		for (FavouriteLocations Loc :FLocList.getAllLocations())
		{
			if(Loc.getName()== target.getName())
			{
				return Loc.registerObserver(DSubscriber);
			}
		}
		return this.add(target);
	}

}
