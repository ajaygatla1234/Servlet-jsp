import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form_Parameters
 */
public class Form_Parameters extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor
     */
    public Form_Parameters() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Service method to handle HTTP requests
     * 
     * @param request  HttpServletRequest object representing the client's request
     * @param response HttpServletResponse object for sending the response to the client
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // PrintWriter to send the response back to the client
        PrintWriter out = response.getWriter();

        // Retrieving form parameters from the client's request
        String username = request.getParameter("username");  // Name of username input field in login.html
        String password = request.getParameter("password");  // Name of password input field in login.html

        // Printing the received form parameters
        out.println("User name : " + username);  // Printing username to the response
        out.println("Password : " + password);   // Printing password to the response
    }

}
