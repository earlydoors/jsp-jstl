package com.jspservletcookbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Include Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome to our Universe</h1>");
		out.println("Imagine the rest of the page here.<br/><br/>");
		//Include the copyright information
		RequestDispatcher dispatcher = req.getRequestDispatcher("/copyright");
		dispatcher.include(req, resp);
		
		out.println("</body>");
		out.println("</html>");
	}
}
