package com.example.assign.observers;

import com.example.assign.entities.Offer;
import com.example.assign.entities.Passenger;

public interface OfferSubject {
	
	    public boolean registerObserver(Passenger p);
	    public boolean removeObserver(Passenger p);
		public void notifyObservers(Offer suggestedOffer);
	


}
