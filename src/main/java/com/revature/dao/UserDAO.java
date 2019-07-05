package com.revature.dao;

import java.util.ArrayList;

import com.revature.pojos.User;

public interface UserDAO {
	
	
	public ArrayList<User> getAllUsers();
	
	public User getEmployeeByFirstName(String firstname);
		
}
