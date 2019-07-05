package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.logs.LoggingUtil;
import com.revature.pojos.User;
import com.revature.services.UserServiceImpl;

public class LoginServlet extends HttpServlet{
	private static UserServiceImpl u = new UserServiceImpl();
		
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.html").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
	User user = u.loginUser(username, password);
	if (user == null) {
		resp.setStatus(401);
		resp.getWriter().write("Failed Login");
	} else {
		LoggingUtil.trace("Successful Login");
		HttpSession sess = req.getSession(true);
		sess.setAttribute("user", user);
	
		switch (user.getRole_id()) {
		case 1:
			LoggingUtil.trace("Successful Employee Login");
			resp.sendRedirect("home");
			break;
		case 2:
			LoggingUtil.trace("Successful DS Login");
			
			resp.sendRedirect("dshome.html");
			break;
		case 3:
			LoggingUtil.trace("Successful DH Login");
			resp.sendRedirect("dhhome.html");
			break;
		case 4:	
			LoggingUtil.trace("Successful BC Login");
			resp.sendRedirect("bencohome.html");
			break;
			
		}
	
		
		}
		
	}

}
