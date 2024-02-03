package com.gl.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    	// Get the values of num1 and num2 from the request
    	int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		// Calculate the sum of num1 and num2
		int k = i + j;
		
		// Session Redirecting Technique:
		// Create or retrieve the session associated with the request
		HttpSession session = req.getSession();
		
		// Set the attribute "k_value" in the session to store the calculated value
		session.setAttribute("k_value", k);
		
		// Redirect the client to the servlet mapped to the "Add" URL
		resp.sendRedirect("Add");  

    }

}
