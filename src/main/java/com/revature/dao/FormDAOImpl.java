package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.logs.LoggingUtil;
import com.revature.pojos.Form;
import com.revature.util.ConnectionFactory;

public class FormDAOImpl implements FormDAO {
					private static Connection connection = ConnectionFactory.getConnection();

					@Override
					public void createNewForm (Form form) {
						
						
						String sql = "INSERT INTO request(employee_id, event_type, address, city, state, zip, event_time, event_date, event_cost, grading_format, status, grade)" + 
								" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
						
						PreparedStatement pstmt;
						
						try {
							pstmt = connection.prepareStatement(sql);
							
							pstmt.setInt(1, form.getEmployee_id());
							System.out.println(form.getEmployee_id());
							pstmt.setString(2, form.getEventDesc());
							pstmt.setString(3, form.getAddress());
							System.out.println("address:" + form.getAddress());
							pstmt.setString(4, form.getCity());
							System.out.println("city:" + form.getCity());
							pstmt.setString(5, form.getState());
							pstmt.setString(6, form.getZip());
							pstmt.setString(7, form.getTime());
							pstmt.setString(8, form.getDate());
							pstmt.setString(9, form.getCost());
							pstmt.setString(10, form.getGradingformat());
							pstmt.setInt(11, 1);
							pstmt.setString(12, form.getGrade());
						
							 pstmt.executeUpdate();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						
					}

					public List<Form> getAllForms() {
						List<Form> formlist = new ArrayList<>();
						Form form;
						
						
						String sql = "select * from employee inner join request on employee.employee_id = "
								+ "request.employee_id inner join request_status on request.status = request_status.status";
						
						PreparedStatement pstmt;
						
						try {
							
							pstmt = connection.prepareStatement(sql);
							ResultSet rs = pstmt.executeQuery();
							
							while(rs.next()) {
								form = new Form();
								form.setEmployee_id(rs.getInt("employee_id"));
								form.setForm_id(rs.getInt("request_id"));
								form.setfirstname(rs.getString("first_name"));
								form.setlastname(rs.getString("last_name))"));
								form.setEventDesc(rs.getString("event_type"));
								form.setAddress(rs.getString("address"));
								form.setCity(rs.getString("city"));
								form.setState(rs.getString("state"));
								form.setZip(rs.getString("zip"));
								form.setDate(rs.getString("date"));
								form.setTime(rs.getString("time"));
								form.setGradingformat(rs.getString("grading_format"));
								form.setGrade(rs.getString("grade"));
								form.setStatus(rs.getInt("status"));
								formlist.add(form);
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
						
						return formlist;
					}
}
