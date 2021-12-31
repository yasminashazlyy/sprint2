package com.example.assign.observers;

import com.example.assign.entities.Driver;
import com.example.assign.entities.Ride;

public interface LocationSubject {
    public boolean registerObserver(Driver d);
    public boolean removeObserver(Driver d);
	public void notifyObservers(Ride requestedRide);
}
