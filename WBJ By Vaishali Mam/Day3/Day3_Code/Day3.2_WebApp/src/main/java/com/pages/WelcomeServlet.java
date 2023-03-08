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
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {

			pw.write("<h3>List Of Products</h3>");
			// pw.write("<h3>Welcome User:"+request.getParameter("txtuser"));//null

			// retrive cookie
			// 3. To retrieve the cookies :
			// HttpServletRequest :
			// Cookie[] getCookies()
			Cookie[] cks = request.getCookies();
			String custEmail=null;String custName=null;
			// String getName()
			// String getValue()
			for (Cookie c : cks) {
				if (c.getName().equals("cust_name")) {
                      custName=c.getValue();
				}
				if (c.getName().equals("cust_email")) {
                    custEmail=c.getValue();
				}
			}
			
			pw.write("<h3>Welcome User:"+custName);
			pw.write("<h3>User Email:"+custEmail);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
