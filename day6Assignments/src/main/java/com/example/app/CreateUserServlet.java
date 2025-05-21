package com.example.app; // ← Make sure this matches your actual package

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/create-user/*")
public class CreateUserServlet extends HttpServlet {

    private final Map<String, User> users = new HashMap<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String email = req.getParameter("email");

        // Simple validation
        if (username == null || email == null || username.isEmpty() || email.isEmpty()) {
            resp.setContentType("text/html");
            resp.getWriter().write("<h2>Error: Username and email are required.</h2>");
            return;
        }

        users.put(email, new User(username, email));

        resp.setContentType("text/html");
        resp.getWriter().write("<h2>User Created Successfully</h2>");
        resp.getWriter().write("<p>Username: " + username + "</p>");
        resp.getWriter().write("<p>Email: " + email + "</p>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String pathInfo = req.getPathInfo(); // e.g., /email@example.com

        resp.setContentType("application/json");

        if (pathInfo == null || pathInfo.equals("/")) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("{\"error\": \"Email not specified in URL.\"}");
            return;
        }

        String email = pathInfo.substring(1); // Remove the leading '/'

        User user = users.get(email);
        if (user != null) {
            resp.getWriter().write("{\"username\": \"" + user.getUsername() + "\", \"email\": \"" + user.getEmail() + "\"}");
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().write("{\"error\": \"User not found.\"}");
        }
    }
}

