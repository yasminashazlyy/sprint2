package com.example.assign.database;

import java.util.ArrayList;
import java.util.List;

import com.example.assign.entities.*;

public class PassengerList implements PassengerDB {
	
	public List <Passenger> passengers = new ArrayList<Passenger>();
	
	 public boolean add(Passenger p)
	 {
		 return passengers.add(p);
	 }
	
	 public List getallpassengers( )
	 {    
		  return passengers;
	 }
	 
	 public Passenger getpassenger(String name )
	 {    
		  for(int i =0 ; i<passengers.size();i++)
		  {
			  if(name.compareTo(passengers.get(i).getUsername())==0)
			       return
			    		   passengers.get(i);
		  }
		return null;
		 
	 }

	public boolean delete(String name) {
		for (Passenger passenger : passengers) {
            if (name.compareTo(passenger.getUsername())==0) {
                return passengers.remove(passenger);
            }
	}
		return false;
}
	
	public boolean logIn(String email , String password)
	{
		 for (int i = 0 ;i<passengers.size();i++)
	        {
	            	if (email.equals(passengers.get(i).getEmail()) && password.equals(passengers.get(i).getPassword()))
	            			{
	            		  System.out.println("Logged in");
	            		  passengers.get(i).isLogged=true;
	            		  return true ;
	            			}
	            	else 
	            	 {
	            		 System.out.println("log in is unsuccessfull");
	            	 }
	        }
		 
		return false;	
	}
	
	
}
