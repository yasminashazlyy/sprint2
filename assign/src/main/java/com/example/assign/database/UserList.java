package com.example.assign.database;

import java.util.ArrayList;
import java.util.List;

import com.example.assign.entities.User;

public class UserList implements UserDB {
	public List <User> users = new ArrayList<User>();

	@Override
	public boolean add(User u)
	{
		 return users.add(u);
	}

	@Override
	public List getallusers() {
		return users;
	}

	@Override
	public User getuser(String name) {
		for(int i =0 ; i<users.size();i++)
		  {
			  if(name.compareTo(users.get(i).getUsername())==0)
			       return
				   users.get(i);
		  }
		return null;
	}

}
