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
import com.example.assign.entities.Passenger;
import com.example.assign.services.IPassengerService;
import com.example.assign.services.PassenegerService;

import java.util.List;
@RestController
public class PassengerController {
	IPassengerService p1 = new PassenegerService();
	
	@GetMapping("/passenger/list")
    public List<Passenger> getAll() {
        return p1.getallpassengers();
    }

    @GetMapping("/passenger/{name}")
    public Passenger get(@PathVariable String name) {
        return p1.getpassenger(name);
    } 

    @PostMapping("/passenger/add/passenger")
    public boolean add(@RequestBody Passenger p) {
        return p1.add(p);
    }
    
    @DeleteMapping("/passaenger/delete/{name}")
    public boolean delete(@PathVariable String name) {
		return p1.delete(name);
	}
    
    @GetMapping("/passenger/login")
    public boolean Login(@RequestBody  Passenger p) {
        return p1.logIn(p.getEmail(), p.getPassword());
      }

}
