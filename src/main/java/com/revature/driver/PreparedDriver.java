
package com.revature.driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.util.ConnectionFactory;

public class PreparedDriver {
	
	
	
	public static void main(String[] args)  {
	
		//Connection conn = DriverManager.getConnection(url, username, password)){
		Connection conn = ConnectionFactory.getConnection();
		Statement statement;
		try {
			statement = conn.createStatement();
			String sql = "insert into Employee VALUES ('uy', 'tt', 'tt', 'tt', 'tt', 'tt', 'tt', 'tat')";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// insert the data
		
		
		
	
	
	}
}
