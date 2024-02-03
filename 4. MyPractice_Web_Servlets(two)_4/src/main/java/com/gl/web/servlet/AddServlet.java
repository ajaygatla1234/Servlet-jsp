package com.gl.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
     * Handles HTTP GET or POST requests for adding two numbers and forwarding the result to another servlet.
     * 
     * @param request  The HttpServletRequest object containing client request information.
     * @param response The HttpServletResponse object for sending the response to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException      If an input or output error occurs while the servlet is handling the HTTP request.
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Parsing the values of num1 and num2 from the request parameters
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        // Adding the two numbers
        int k = i + j;

        // Setting the result value as an attribute in the request
        req.setAttribute("k_value", k);

        // Creating a RequestDispatcher to forward the request and response to another servlet
        RequestDispatcher rd = req.getRequestDispatcher("Add"); // "Add" is the URL specified in servlet mapping in web.xml

        // Forwarding the request and response to another servlet for further processing
        rd.forward(req, resp);
    }

}
