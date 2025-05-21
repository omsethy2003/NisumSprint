package Servelets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ContextServletParam extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = getServletContext();
        String company = context.getInitParameter("companyName");

        PrintWriter out = response.getWriter();
        out.println("<h3>Company Name: " + company + "</h3>");
    }
}

