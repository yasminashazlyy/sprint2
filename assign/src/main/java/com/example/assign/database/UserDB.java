package com.example.assign.database;

import java.util.List;

import com.example.assign.entities.User;

public interface UserDB {

	 public boolean add(User u);
	 public List getallusers( );
	 public User getuser(String name );
	 

}
