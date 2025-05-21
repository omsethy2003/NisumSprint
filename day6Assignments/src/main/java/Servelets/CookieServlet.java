package Servelets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("user", "JohnDoe");
        response.addCookie(cookie);

        PrintWriter out = response.getWriter();
        out.println("<h3>Cookie has been set.</h3>");

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>" + c.getName() + ": " + c.getValue() + "</p>");
            }
        }
    }
}
