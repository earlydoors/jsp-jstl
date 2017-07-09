package com.jspservletcookbook;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Using RequestDispatcher to forward a request
 * @author JGreenwood
 *
 */

public class Controller extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		String param = req.getParameter("go");
		
		boolean useNamedDispatcher = false;
		
		if (!useNamedDispatcher){
			if (param == null){
				throw new ServletException("Missing parameter in Controller");
			} else if (param.equals("weather")){
				dispatcher = req.getRequestDispatcher("/weather");
			} else if (param.equals("maps")){
				dispatcher = req.getRequestDispatcher("/maps");
			} else if (param.equals("include")){
				dispatcher = req.getRequestDispatcher("/include");					
			} else if (param.equals("privacy")){
				dispatcher = req.getRequestDispatcher("/privacy");				
			} else {
				throw new ServletException("Improper parameter passed to Controller");
			}
			
		} else {
			if (param == null){
				throw new ServletException("Missing parameter in Controller");
			} else if (param.equals("weather")){
				dispatcher = req.getServletContext().getNamedDispatcher("Weather");	//uses the named servlets loaded into ServletContext from web.xml at startup
			} else if (param.equals("maps")){
				dispatcher = req.getServletContext().getNamedDispatcher("Maps"); //uses the named servlets loaded into ServletContext from web.xml at startup
			} else if (param.equals("include")){
				dispatcher = req.getServletContext().getNamedDispatcher("IncludeServlet");					
			} else if (param.equals("privacy")){
				dispatcher = req.getServletContext().getNamedDispatcher("PrivacyServlet");				
			} else {
				throw new ServletException("Improper parameter passed to Controller");
			}
		}
		

		
		//if we get this far dispatch the request to the correct URL
		if (dispatcher != null){
			try {
				dispatcher.forward(req, resp);
			} catch (Exception e){
				e.printStackTrace();
			}
			
		} else {
			throw new ServletException("Controller received a null dispatcher from Request object");
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
