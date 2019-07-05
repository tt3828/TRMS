package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.logs.LoggingUtil;
import com.revature.pojos.User;
import com.revature.services.UserServiceImpl;

public class HomeServlet extends HttpServlet{
	private static UserServiceImpl user = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		HttpSession sess = req.getSession();
		User user = (User) sess.getAttribute("user");
		
		//System.out.println(user);
		
		if (user == null) {
			resp.sendRedirect("login.html");
		} else {
		
		String username = user.getUsername();//req.getParameter("username");
		String password = user.getPassword();//req.getParameter("password");
		LoggingUtil.trace("username: " + username + " password: " + password);
		//User user = us.loginUser(username, password);
		resp.setContentType("text/html;charset=UTF-8");
		 
		PrintWriter pw = resp.getWriter();
		
		if (user != null) {
			
			pw.write("<h1>Welcome</h1>\n");
			pw.write("<a href='NewForm'>Start A New Reimbursment Form</a>\n"
					+ "<a href='FormList'>View Status of Pending Reimbursment Forms</a>\n");
			pw.write("<a href='logout'>Logout</a>");
		}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doGet(req, resp);
	}

}
