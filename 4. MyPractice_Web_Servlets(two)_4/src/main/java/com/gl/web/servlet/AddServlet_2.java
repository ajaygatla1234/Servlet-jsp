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
     * Default constructor.
     */
    public AddServlet_2() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Handles HTTP GET or POST requests for calculating the square of a number.
     * 
     * @param request  The HttpServletRequest object containing client request information.
     * @param response The HttpServletResponse object for sending the response to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException      If an input or output error occurs while the servlet is handling the HTTP request.
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Getting PrintWriter from HttpServletResponse to write the response
        PrintWriter out = response.getWriter();

        // Retrieving the attribute "k_value" from the request
        int k = (int) request.getAttribute("k_value");

        // Calculating the square of the retrieved value
        k = k * k;

        // Printing the result of the square operation to the response
        out.println("Result of square of :" + k);
    }

}
