package com.gl.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add") // Specifies the URL pattern for which this servlet will be invoked
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
     * Handles HTTP requests for adding two numbers and uses the Cookies Redirecting Technique.
     * 
     * @param req The HttpServletRequest object containing client request information.
     * @param resp The HttpServletResponse object for sending the response to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException If an input or output error occurs while the servlet is handling the HTTP request.
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Extracting values of the two numbers from the request parameters
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        // Calculating the sum of the two numbers
        int k = i + j;

        // Creating a new cookie named "k" with the sum value
        Cookie cookie = new Cookie("k", k + "");

        // Adding the cookie to the response
        resp.addCookie(cookie);

        // Redirecting to the servlet named "Add"
        resp.sendRedirect("Add");
    }
}
