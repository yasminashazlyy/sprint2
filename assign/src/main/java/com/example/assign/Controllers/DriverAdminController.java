package com.example.assign.Controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assign.entities.Driver;
import com.example.assign.services.DriverAdminService;
import com.example.assign.services.Driverservice;
import com.example.assign.services.IDriverService;
@RestController

public class DriverAdminController {
	
    private DriverAdminService admin = new DriverAdminService();
	private IDriverService drivers = new Driverservice();


	@GetMapping("/driver/all drivers")
    public List<Driver> getAll() {
        return drivers.getPendingDriverList();
    }


    @PostMapping("/admin/verify/{name}")
    public boolean verify(@PathVariable String name) {
         return admin.verify(drivers.getdriver(name));
    }
}



