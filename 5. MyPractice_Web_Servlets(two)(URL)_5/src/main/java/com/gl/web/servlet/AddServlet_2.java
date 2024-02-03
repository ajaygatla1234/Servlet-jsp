package com.gl.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet_2
 */
public class AddServlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get PrintWriter object to send HTML response
		PrintWriter out = response.getWriter();
		
		// Retrieve the value of 'k_value' parameter from the request
		int k = Integer.parseInt(request.getParameter("k_value"));
		
		// Calculate the square of 'k'
		k = k * k;
		
		// Send the result as an HTML response
		out.println("Result of square of :" + k);
		
		// Log a message to the console (Optional)
		System.out.println("add");
	}

}
