package Servelets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ShoppingCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String item = request.getParameter("item");
        HttpSession session = request.getSession();
        String cart = (String) session.getAttribute("cart");

        if (cart == null) cart = "";
        cart += item + ", ";
        session.setAttribute("cart", cart);

        PrintWriter out = response.getWriter();
        out.println("<h3>Item added to cart!</h3>");
        out.println("<p>Cart contents: " + cart + "</p>");
    }
}
