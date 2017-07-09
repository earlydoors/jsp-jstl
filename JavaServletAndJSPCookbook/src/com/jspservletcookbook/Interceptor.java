package com.jspservletcookbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//set the MIME type of the response
        resp.setContentType("text/html");
        
        //use a PrintWriter to send text data to the client who has requested the servlet            
        PrintWriter out = resp.getWriter();
       
        //Begin assembling the HTML content            
        out.println("<html><head>");
       
        out.println("<title>Interceptor</title></head><body>");
        out.println("<h2>You have been intercepted by the Front Controller Design Pattern</h2>");
        out.println("<p>More specific <b>servlet</b> mappings in the web.xml will bypass this interceptor</p>");
        out.println("<p>but not .jsp and .html - it appears</p>");
        out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	

}
