package com.pages;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcomeservlet
 */
@WebServlet("/welcome")
public class Welcomeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		//can i display user name here
//		
//		//get session 
//		HttpSession hs=request.getSession();
//		System.out.println("Cust_name"+hs.getAttribute("cust_name"));
//		System.out.println("--Session Id--"+hs.getId());
//		System.out.println("--MyValidate Servlet Session isNew--"+hs.isNew());
//		System.out.println("--Session Created--"+hs.getCreationTime());
//		
//		System.out.println("-------------------------------------");
//		System.out.println("request Obj:"+request.getAttribute("r_param1"));
//		
//		
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("-------------------------------------");
		System.out.println("request Obj:"+req.getAttribute("r_param1"));
		
	}
	

}
