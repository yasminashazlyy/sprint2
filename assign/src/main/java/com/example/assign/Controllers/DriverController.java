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
import com.example.assign.services.IDriverService;
import com.example.assign.services.DriverAdminService;
import com.example.assign.services.Driverservice;

import java.util.List;
@RestController
public class DriverController {
	
	//3ayza a-return le driver wahed kol el fav areas beta3too. url slash driver slash {userrnaem}/favloc
	//aroh andah obj mn no3 driver service d1 d1.getall fav loc el heya gowa dlist w driver service
	//lazem el driver ykon 3ando ability to add fav area
	//to request el ride a compare el source be kol el fav areas el gowa el system w aroh ageeb el drivers beto3ha 
	
	IDriverService d1 = new Driverservice();
	public DriverAdminService admin= new DriverAdminService();
	
	@GetMapping("/driver/list")
    public List<Driver> getAll() {
        return d1.getalldrivers();
    }

    @GetMapping("/driver/{name}")
    public Driver get(@PathVariable String name) {
        return d1.getdriver(name);
    }

    @PostMapping("/driver/add/driver")
    public boolean add(@RequestBody Driver d) {
        return d1.add(d);
    }
    @DeleteMapping("/driver/delete/{name}")
    public boolean delete(@PathVariable String name) {
		return d1.delete(name);
	}

    
    @PostMapping("/driver/add/favouriteLocations")
    public boolean addToDriverFavLocationList(@RequestBody FavouriteLocations d) {
        return d1.addToDriverFavLocationList(d);
    }
    
    @GetMapping("/driver/favouriteLocations/list")
    public List<FavouriteLocations> getDriverFavouriteAreas(String dname) {
        return d1.getDriverFavouriteAreas(dname);
    }
    
    @PostMapping("/driver/login")
    public boolean Login(@RequestBody Driver d) {
      return d1.logIn(d.getEmail(), d.getPassword());
    }
    
   /* @PutMapping("/driver/delete/driver")
    public boolean update(Driver d, FavouriteLocations f) {
	}*/
}
