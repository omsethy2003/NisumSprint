package Servelets;

import java.io.*;
import java.util.Enumeration;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RequestHeaderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<h3>Request Headers</h3>");
        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            out.println("<p>" + name + ": " + value + "</p>");
        }
    }
}
