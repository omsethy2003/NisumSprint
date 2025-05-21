package Servelets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class GetPostServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("This is a GET request");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("This is a POST request");
    }
}

