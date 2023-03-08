package com.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dal.UserDALImpl;
import com.pojo.User;
import com.utils.DBUtils;

/**
 * Servlet implementation class LoginServlet
 */

//at the time of deployment
//WC creates empty map
//key:/validate
//value:com.pages.LoginServlet


@WebServlet(value="/validate",loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	UserDALImpl userDao;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try
		{
		//open connection
			DBUtils.openConnection();//open connection with database
		//create userdao object
			userDao=new UserDALImpl();//constr
			//
		}
		catch(Exception e)
		{
			
		}
		
		
		System.out.println("--inside init---"+getClass());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("--inside destroy---"+getClass());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//server will send some data to client
		//set
		response.setContentType("text/html");
		
		//send welcome msg to cleint
		//create PrintWriter pw=response.getWriter();
		
		try(PrintWriter pw=response.getWriter())
		{
			
		 
		pw.write("<h2>Welcome To Login Validation</h2>");//client browser
		System.out.println("--inside doPost---"+getClass());//server console
		
		
		//how to get txtuser and txt pwd values in servlet
		// request.getParameter(string);
		//<input type="text" name="txtuser" >
		String username=request.getParameter("txtuser");
		String pwd=request.getParameter("txtpwd");
		
		//chk username and pwd are correct or not
		//if correct :user is valid
		//else not valid
		
		//
		User userObj=  userDao.validateUser(username, pwd);
		
		if(userObj==null)
		{
			System.out.println("--invalid----");
			//invalid user
			pw.write("<h2>Invalid User  <a href='login.html'>Retry </a> </h2>");
		}
		else
		{
			System.out.println("---valid user-----");
			//valid
			pw.write("<h2>Valid User </h2>");
			pw.write("Welcome :"+userObj.getCustName());
			pw.write("<h3>User "+userObj+" </h3>");
			//pw.flush();//java.lang.IllegalStateException: Cannot call sendRedirect() after the response has been committed
			//client pool Tech
			//send new request to welcome page
			//
			response.sendRedirect("welcome");
			
			
			//OR
			
			//server pool
			//RequestDispatcher dis=request.getRequestDispatcher("welcome");
			//dis.forward(request, response);
			//or
			//dis.include(request, response);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
