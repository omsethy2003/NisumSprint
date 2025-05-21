package Servelets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        if ("admin".equals(username) && "pass123".equals(password)) {
            out.println("<h3>Login Successful</h3>");
        } else {
            out.println("<h3>Invalid Credentials</h3>");
        }
    }
}
