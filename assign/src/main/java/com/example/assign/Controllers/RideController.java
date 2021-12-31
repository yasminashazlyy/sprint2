package com.example.assign.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.assign.entities.Passenger;
import com.example.assign.entities.Ride;
import com.example.assign.services.ILocationService;
import com.example.assign.services.IPassengerService;
import com.example.assign.services.IRideService;
import com.example.assign.services.RideService;

public class RideController {
	
	private IRideService rService;
	private IPassengerService passService;
	public ILocationService locationService;

    @PostMapping("/rides/add/by/passengername/{username}")
    public Boolean add(@PathVariable String username ,@RequestBody Ride ride) {
    	Passenger requester;
    	requester=passService.getpassenger(username);
    	ride.setRideRequester(requester);
        return rService.add(ride);
    }

    @GetMapping("/rides")
    public List<Ride> getAll() {
        return rService.getAll();
    }

    @GetMapping("/rides/{id}") //path variable id 3ashan da haytghgyar 
    public Ride get(@PathVariable int id) {
        return rService.get(id);
    }

    @DeleteMapping("/rides/{id}/delete")
    public boolean delete(@PathVariable int id) {
        return rService.delete(id);
    }

}
