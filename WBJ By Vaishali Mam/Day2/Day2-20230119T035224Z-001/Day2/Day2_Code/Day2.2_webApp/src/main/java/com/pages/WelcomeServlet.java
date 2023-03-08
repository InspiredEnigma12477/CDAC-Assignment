package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public void init(ServletConfig config) throws ServletException {
	System.out.println("-----inside init WelcomeServlet----");	 
	}

	 
	public void destroy() {
		System.out.println("-----inside destroy WelcomeServlet----");	
	}

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("-----inside doGet WelcomeServlet----");	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	   ////to write data on browser
		//Use Response  Method response.getWriter()  return PrintWriter
	  try(PrintWriter pw=response.getWriter();)
	  {
	  //content type is  text/html
	  //set Content type for response
	  
	  response.setContentType("text/html");
		   
	//generate response
	  pw.write("<h2>Welcome To IACSD  @"+LocalDateTime.now()   +"</h2>");
	
	pw.write("<hr>");
	
	pw.write("<h2><i> This is welcome Servlet--</i></h2>");
	
	  }
	  catch(Exception ex)
	  {
		  System.out.println(ex.getMessage());
	  }
	
	
	
	
	
	}

}
