package com.jspservletcookbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JspInfo extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//set the MIME type of the response
        resp.setContentType("text/html");
        
        //use a PrintWriter to send text data to the client who has requested the servlet            
        PrintWriter out = resp.getWriter();
       
        //Begin assembling the HTML content            
        out.println("<html><head>");
       
        out.println("<title>JSP Info</title></head><body>");
        out.println("</body></html>");
	}
	
	

}
