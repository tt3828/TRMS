package com.revature.services;

import java.util.ArrayList;
import com.revature.dao.UserDAO;
import com.revature.pojos.User;
import com.revature.dao.UserDAOImpl;

public class UserServiceImpl implements UserService {
	
	
	
	private static UserDAO  newDao = new UserDAOImpl();	
	
	@Override
	public User loginUser(String username, String password) {
	
		
		
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
		User employee = null;
		for (User check : newDao.getAllUsers()) {
			if (check.getUsername().equals(username)&& check.getPassword().equals(password) ) {
				employee = check;
				System.out.println(employee);
				break;
				
			}
		}
		return employee;
		
		
	}
	



	



	

}
