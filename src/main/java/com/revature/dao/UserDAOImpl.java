package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.logs.LoggingUtil;
import com.revature.pojos.User;
import com.revature.util.ConnectionFactory;


public class UserDAOImpl implements UserDAO {
	
	Connection conn = ConnectionFactory.getConnection();
	
		    @Override
		    public ArrayList<User> getAllUsers() {
		        
		        ArrayList<User> employeeList = new ArrayList<User>();
		        
		       
		        String sql = "select * from Employee";
		        PreparedStatement pstmt;
				try {
					pstmt = conn.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();
		            
		            while(rs.next()) {
		          employeeList.add(new User(rs.getInt(1), rs.getInt(2), rs.getString(3),
		        		  rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8)));
		            }
		            
		        }    catch (SQLException e) {
		                e.printStackTrace();
		        }
		        return employeeList;
		    }

			@Override
			public User getEmployeeByFirstName(String firstname) {
				// TODO Auto-generated method stub
				return null;
			}
		    
		
	}








		
		
