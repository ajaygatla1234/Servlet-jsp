package com.gl.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.student.Student;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Service method to handle HTTP requests.
     * 
     * @param request The HttpServletRequest object containing client request information.
     * @param response The HttpServletResponse object for sending the response to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException If an input or output error occurs while the servlet is handling the HTTP request.
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Setting attributes in the request scope

        // Setting a simple attribute with a String value
        String name = "Ajay";
        request.setAttribute("Myname", name);

        // Creating a Student object and setting it as an attribute
        Student student = new Student(1, "Ajay");
        request.setAttribute("student", student);

        // Creating a List of Student objects and setting it as an attribute
        List<Student> students = Arrays.asList(new Student(2, "Subbu"), new Student(3, "Jaggu"));
        request.setAttribute("students", students);

        // Forwarding the request and response to 'display.jsp' for further processing
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.forward(request, response);
    }

}
