package com.example.assign.Controllers;
 
import java.util.List;


 
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import com.example.assign.entities.Driver;
import com.example.assign.entities.FavouriteLocations;
import com.example.assign.services.Driverservice;
import com.example.assign.services.IDriverService;
import com.example.assign.services.ILocationService;
import com.example.assign.services.LocationService;

import java.util.List;
@RestController
public class LocationsController {
	
	ILocationService L1 = new LocationService();
	IDriverService D1 = new Driverservice();
	
	@GetMapping("/locations/list")
    public List<FavouriteLocations> getAllLocations() {
        return L1.getAllLocations();
    }

    @PostMapping("/add/driver/{username}/favouriteLocations")
    public boolean add(@PathVariable String username, @RequestBody FavouriteLocations FL) {
    	Driver currentDriver = D1.getdriver(username);
    	if (currentDriver!=null)
    	{
    		currentDriver.setFavouriteLocations(FL);
    	}
        return L1.update(FL,currentDriver);
    }
    
    @GetMapping("/favouriteLocations/{name}")
    public FavouriteLocations get(@PathVariable String name) {
        return L1.get(name);
    }
    
    
}
    
    