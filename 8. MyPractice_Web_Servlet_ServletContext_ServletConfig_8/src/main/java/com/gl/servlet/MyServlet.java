package com.gl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        // Obtaining ServletContext (for global application parameters)
        ServletContext context = getServletContext(); // or request.getServletContext()
        out.println("Output using ServletContext");

        // Retrieving and outputting values from context parameters
        context.getInitParameter("MyName"); // This line does not have any effect, as the value is not used
        out.print(context.getInitParameter("MyName"));
        out.print("  : ");
        out.println(context.getInitParameter("MyPhone"));

        System.out.println("hi"); // This line prints a message to the console, not to the web page

        out.println();

        // Obtaining ServletConfig (for servlet-specific parameters)
        ServletConfig config = getServletConfig();
        out.println("Output using ServletConfig");

        // Retrieving and outputting values from servlet config parameters
        out.print(config.getInitParameter("MyName"));
        out.print("  : ");
        out.println(config.getInitParameter("MyPhone"));
    }
}
