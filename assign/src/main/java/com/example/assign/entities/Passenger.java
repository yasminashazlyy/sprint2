package com.example.assign.entities;

import com.example.assign.observers.OfferObserver;

public class Passenger extends User implements OfferObserver {
	public boolean isLogged;
	
	public Passenger ()
	{
         this.isLogged=false;
		
	}

	@Override
	public void update(String name) {
		// TODO Auto-generated method stub
		
	}

}
	
	
 


