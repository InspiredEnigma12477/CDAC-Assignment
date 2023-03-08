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

import com.dal.UserDALImpl;
import com.pojo.User;
import com.utils.DBUtils;

//
@WebServlet(value = "/login", loadOnStartup = 1)
public class ValidationServlet1 extends HttpServlet {
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
			
			//Get Http Session object from WC
			HttpSession hs=request.getSession();
			 
			//How to save data in HttpSession?(scope=entire session)
			//API of HttpSession i/f
			
			hs.setAttribute("cust_info",userObj);
			
			System.out.println("--session created:"+hs.getId());
			System.out.println("--session created:"+hs.isNew());
			
		 response.sendRedirect("welcome");
			
		}
		
		
		
		
		
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// TODO Auto-generated method stub
	}

}
