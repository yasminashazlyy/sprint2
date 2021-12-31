package com.example.assign.database;

import java.util.ArrayList;
import java.util.List;

import com.example.assign.entities.*;

public class DriverList implements DriverDB {
	
	public List <Driver> drivers = new ArrayList<Driver>();
	private List <FavouriteLocations> DFAVLOC = new ArrayList<FavouriteLocations>();
	private List<Ride> driverRides = new ArrayList<Ride>();	
	 public boolean add(Driver d)
	 {    
		 
		 return drivers.add(d);
	 }
	
	 public List getalldrivers( )
	 {    
		  return drivers;
	 }
	 
	 public Driver getdriver(String name )
	 {    
		  for(int i =0 ; i<drivers.size();i++)
		  {
			  if(name.compareTo(drivers.get(i).getUsername())==0)
			       return
				   drivers.get(i);
		  }
		return null;
		 
	 }

	@Override
	public boolean delete(String name) {
		for (Driver driver : drivers) {
            if (name.compareTo(driver.getUsername())==0) {
                return drivers.remove(driver);
            }
        }
        return false;
	}

	@Override
	public boolean addToDriverFavLocationList(FavouriteLocations dFavLocations) {
	     return DFAVLOC.add(dFavLocations);
	}
	
	 public List getDriverFavouriteAreas(String name)
	 {
		return DFAVLOC;
		
	 }

	@Override
    public List getPendingDriverList()
    {
        List <Driver> unverifiedList = new ArrayList<Driver>();
        
        for (int i = 0 ;i<drivers.size();i++)
        {
            if(drivers.get(i).verified == false)
            {
                
            	unverifiedList.add(drivers.get(i));

            }

        }
        return unverifiedList;
    }
	
	public boolean logIn(String email , String password)
	{
		 for (int i = 0 ;i<drivers.size();i++)
	        {
	            if(drivers.get(i).verified == false)
	            {
	            	if (email.equals(drivers.get(i).getEmail()) && password.equals(drivers.get(i).getPassword()))
	            			{
	            		  System.out.println("Logged in");
	            			}
	            }
	            else 
	            {
	            	 System.out.println("Driver is not verified");
	            }
	        }
	            
		return false;	
	}

	
	/* public boolean update(Driver d, FavouriteLocations f) {
			return ;
		}*/
		
		public List<Ride> getRides(String name) {
			return driverRides;
		}
		


}
