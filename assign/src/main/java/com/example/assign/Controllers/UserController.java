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
import com.example.assign.entities.User;
import com.example.assign.services.IUserService;
import com.example.assign.services.UserService;

import java.util.List;
@RestController
public class UserController {
	IUserService u1 = new UserService();
	
	@GetMapping("/users/list")
    public List<User> getAll() {
        return u1.getallusers();
    }

    @GetMapping("/user/{name}")
    public User get(@PathVariable String name) {
        return u1.getuser(name);
    }

    @PostMapping("/user/add/user")
    public boolean add(@RequestBody User u) {
        return u1.add(u);
    }

}
