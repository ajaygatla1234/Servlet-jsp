package com.gl.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet_2
 */
@WebServlet("/Add")  // Specifies the URL pattern for which this servlet will be invoked
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
     * Handles HTTP GET requests for processing the result stored in a cookie.
     * 
     * @param request  The HttpServletRequest object containing client request information.
     * @param response The HttpServletResponse object for sending the response to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException      If an input or output error occurs while the servlet is handling the HTTP request.
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieving cookies from the request
        Cookie cookie[] = request.getCookies();
        
        int k = 0;
        
        // Iterating through cookies to find the one named "k"
        for (Cookie c : cookie) {
            if (c.getName().equals("k")) {
                k = Integer.parseInt(c.getValue());
            }
        }

        // Squaring the value retrieved from the cookie
        k = k * k;

        // Getting PrintWriter to send the result as the HTTP response
        PrintWriter out = response.getWriter();
        out.println("Result is : " + k);
    }

}
