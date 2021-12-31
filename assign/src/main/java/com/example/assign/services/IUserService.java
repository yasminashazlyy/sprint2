package com.example.assign.services;

import java.util.List;

import com.example.assign.database.UserList;
import com.example.assign.entities.User;

public interface IUserService {
	UserList l1 = new UserList();
	
	 public boolean add(User u);
	 public List getallusers( );
	 public User getuser(String name  );

}
