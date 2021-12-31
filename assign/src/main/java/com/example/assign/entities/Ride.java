package com.example.assign.entities;

public class Ride {
	
    private int id;
    private String pickUp;
    private String dropOff;
    private Passenger rideRequester;

    public Passenger getRideRequester() {
		return rideRequester;
	}

	public void setRideRequester(Passenger rideRequester) {
		this.rideRequester = rideRequester;
	}

	public Ride() {
    }

    public Ride(String source, String destination) {
        this.pickUp = source;
        this.dropOff = destination;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getPickUp() {
        return this.pickUp;
    }

    public String getDropOff() {
        return this.dropOff;
    }
    
    
}
