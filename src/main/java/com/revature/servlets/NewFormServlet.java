package com.revature.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.pojos.Form;
import com.revature.pojos.User;
import com.revature.services.FormServiceImpl;

/**
 * Servlet implementation class NewForm
 */
public class NewFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private static  FormServiceImpl fsi = new FormServiceImpl();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("NewForm.html").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = req.getSession(false);
        
        if (sess == null || sess.getAttribute("user") == null) {
            response.sendRedirect("login.html");
            return;
        }
        
        User user = (User) sess.getAttribute("user");
        
		String event = req.getParameter("event");
		System.out.println("Event:" + event);
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		System.out.println("City: " +city);
		String state = req.getParameter("state");
		String zip = req.getParameter("zip");
		String time = req.getParameter("time");
		String date = req.getParameter("date");
		String cost = req.getParameter("cost");
		String gradingformat = req.getParameter("gradingformat");
		String grade = req.getParameter("grade");
		
		Form newform = new Form(user.getEmployee_id(), event, address, city, state, zip, date, cost, time, gradingformat, grade);
		
		fsi.createNewForm(newform);
		
		if (fsi != null) {
			response.sendRedirect("home");
		}
		
		// if null not work
	
		
	}
	}


