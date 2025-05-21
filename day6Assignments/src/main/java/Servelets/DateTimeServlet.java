package Servelets;

import java.io.*;
import java.util.Date;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DateTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Date date = new Date();
        PrintWriter out = response.getWriter();
        out.println("<h2>Current Date and Time: " + date.toString() + "</h2>");
    }
}
