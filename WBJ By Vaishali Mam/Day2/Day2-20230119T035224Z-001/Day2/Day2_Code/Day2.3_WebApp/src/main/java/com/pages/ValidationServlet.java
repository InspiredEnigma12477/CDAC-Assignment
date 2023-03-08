package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

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
 * Servlet implementation class ValidationServlet
 */
@WebServlet(value="/loginServlet",loadOnStartup = -1)
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	UserDALImpl userDao;
	
	public void init(ServletConfig config) throws ServletException {
		 try
		 {
		System.out.println("---inside init validationServlet----");
		DBUtils.openConnection();
		userDao=new UserDALImpl();
		 }
		 catch(Exception ex)
		 {
			throw new ServletException("Error:In Init", ex);
		 }
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("--inside Destroy----"); 
		try {
			userDao.cleanUp();
			DBUtils.closeConnection();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("--inside doPost validationServlet-----");
		response.setContentType("text/html");
		
		try(PrintWriter pr=response.getWriter();)
		{
		pr.write("<h1>Welcome To IACSD</h1>");
		pr.write("<hr>");
		
		//display name of user here on validationServlet
		//public String getParameter(String paramName)

		String username=request.getParameter("txtuser");
		
		//get pwd
		String pwd=request.getParameter("txtpwd");
		
		pr.write("<h3>Welcome :"+username+"</h3>");
		
		
		//call userDao.validUser method for validation
		User userObj=userDao.validateUser(username, pwd);
		if(userObj!=null)
		{
			pr.write("<h3>Valid User :"+username+"</h3>");
			pr.write("<h3>"+userObj+"</h3>");
		}
		else
		{
			pr.write("<h3>InValid User :"+username+"</h3>");	
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//pr.write("<h3>pwd :"+pwd+"</h3>");
		
		
//		if(username.equals("IACSD")&& pwd.equals("abc@123"))
//		{
//			pr.write("<h3>Valid User :"+username+"</h3>");	
//		}
//		else
//		{
//			pr.write("<h3>Invalid :"+username+"</h3>");
//		}	
		
		
		
	}

}
