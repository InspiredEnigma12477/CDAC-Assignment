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

import com.dal.UserDALImpl;
import com.pojo.User;
import com.utils.DBUtils;

//
@WebServlet(value = "/validate", loadOnStartup = 1)
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	private UserDALImpl userDao;

	public void init(ServletConfig config) throws ServletException {

		System.out.println("init --" + getClass());
		try {
			// open connection
			DBUtils.openConnection();
			userDao = new UserDALImpl();

		} catch (Exception e) {
			throw new ServletException("Error:", e);
		}

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {

			pw.write("<h2>Welcome To Login Servlet</h2>");

			// validate User

			User userObj = userDao.validateUser(request.getParameter("txtuser"), request.getParameter("txtpwd"));

		if(userObj==null)
		{System.out.println("invalid login----");
			pw.write("<h3>Invalid Login<a href='login.html'>Retry</a></h3>"); 
		}
		else
		{
			pw.write("<h1>Welcome To :"+userObj.getCustName());
			pw.write("<h2> "+userObj);
			//for valid user redirect to welcome page
			
			
			//maintain user specific data across multiple requests
			//use cookie
			// Create cookie/s instance/s
			//javax.servlet.http.Cookie(String cName,String cVal)
			Cookie ck1=new Cookie("cust_name", userObj.getCustName());
			
			//create one more cookie for storing email
			Cookie ck2=new Cookie("cust_email", request.getParameter("txtuser"));
			
			//2.Add the cookie/s to the resp hdr.
			//HttpServletResponse API :
				//void addCookie(Cookie c)
			response.addCookie(ck1);
			response.addCookie(ck2);
			
		 response.sendRedirect("welcome");
			
		}
		
		
		
		
		
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// TODO Auto-generated method stub
	}

}
