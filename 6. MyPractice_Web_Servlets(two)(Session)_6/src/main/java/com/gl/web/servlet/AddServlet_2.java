package com.gl.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get the session associated with the request
		HttpSession session = request.getSession();
		
		// Retrieve the attribute "k_value" from the session
		int k = (int) session.getAttribute("k_value");
		
		// Calculate the square of k
		k = k * k;
		
		// Get the PrintWriter object to send the response back to the client
		PrintWriter out = response.getWriter();
		
		// Print the result to the response
		out.println("Result is : " + k);
	}

}
