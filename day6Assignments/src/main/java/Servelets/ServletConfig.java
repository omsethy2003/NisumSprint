package Servelets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ServletConfig extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        jakarta.servlet.ServletConfig config = getServletConfig();
        String adminEmail = config.getInitParameter("adminEmail");

        PrintWriter out = response.getWriter();
        out.println("<h3>Admin Email: " + adminEmail + "</h3>");
    }
}
