package com.example.assign.services;

import java.util.List;

import com.example.assign.entities.User;

public class UserService implements IUserService {

	@Override
	public boolean add(User u) {
		 return l1.add(u);

	}

	@Override
	public List getallusers() {
		 return l1.getallusers();
	}

	@Override
	public User getuser(String name) {
		  return l1.getuser(name);

	}

}
