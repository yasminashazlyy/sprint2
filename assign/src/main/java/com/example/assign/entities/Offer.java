package com.example.assign.entities;

import com.example.assign.observers.OfferSubject;

public class Offer implements OfferSubject {
	int offferValue;

	@Override
	public boolean registerObserver(Passenger p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeObserver(Passenger p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void notifyObservers(Offer suggestedOffer) {
		// TODO Auto-generated method stub
		
	}
	

}
