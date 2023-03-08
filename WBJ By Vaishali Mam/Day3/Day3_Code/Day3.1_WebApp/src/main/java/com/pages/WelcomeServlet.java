package com.pages;

import java.io.IOException;
import java.io.PrintWriter;

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

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		try (PrintWriter pw = response.getWriter()) {

			response.setContentType("text/html");
			
			pw.write("<h2>Welcome To  Shopping Products</h2>");
			pw.write("<hr><h3>Welcome Valid User</h3>");
			//display username 
			pw.write("<hr><h3> User:"+request.getParameter("txtuser")+"</h3>");
			
			
			//BL +UI
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
