package com.revature.services;

import com.revature.dao.UserDAO;
import com.revature.pojos.User;

public interface UserService  {
	
	public User loginUser(String username, String password); 


}
