package com.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.User;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {

			
			pw.write("<h3>List Of Products</h3>");
			
			//get data from HttpSession
			HttpSession hs=request.getSession();
			System.out.println("---is New On welcome:"+hs.isNew());
			User userObj=(User) hs.getAttribute("cust_info");
			pw.write("<h2>"+userObj+"</h2>");
			 

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
