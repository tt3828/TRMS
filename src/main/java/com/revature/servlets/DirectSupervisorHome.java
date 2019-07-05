package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.pojos.Form;
import com.revature.services.FormServiceImpl;


/**
 * Servlet implementation class DirectSupervisorHome
 */
public class DirectSupervisorHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static FormServiceImpl fsi = new FormServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DirectSupervisorHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("dshome.html").forward(request, response);
List<Form> formlist = fsi.viewAllForms();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String formListString = objectMapper.writeValueAsString(formlist);
		
		response.getWriter().write(formListString);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}
}
