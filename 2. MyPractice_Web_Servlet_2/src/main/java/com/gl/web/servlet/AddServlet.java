package com.gl.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Handles HTTP GET or POST requests for addition.
     * 
     * @param req  The HttpServletRequest object containing client request information.
     * @param resp The HttpServletResponse object for sending the response to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException      If an input or output error occurs while the servlet is handling the HTTP request.
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieving values from the request parameters
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        // Performing addition operation
        int k = i + j;

        // Getting PrintWriter from HttpServletResponse to write the response
        PrintWriter out = resp.getWriter();

        // Printing the result to the response
        out.println("Result is : " + k);
    }
}
