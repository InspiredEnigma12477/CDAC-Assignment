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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyValidateServlet
 */



//key:/validate
//value :com.pages.MyValidateServlet
@WebServlet(value="/validate",loadOnStartup = 1)
public class MyValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		 System.out.println("----init---"+getClass());
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		 System.out.println("----destroy---"+getClass());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("----doPost---"+getClass());

		String username=request.getParameter("em");
		String pwd=request.getParameter("pass");
		
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter()){
			
			pw.write("<h2>Welcome:"+username+"</h2>");
			// call Dao  validation(username,pwd) return User obj
			//if obj is not null means valid user
			//valid user redirect to next
			
			
			//client pull-I  :clicking on login button
			//client pull-II :browser send request
			
			//pw.flush();//error:java.lang.IllegalStateException:
			
			HttpSession hs=request.getSession();
			hs.setAttribute("cust_name",username);
			System.out.println("--Session Id--"+hs.getId());
			System.out.println("--MyValidate Servlet Session isNew--"+hs.isNew());
			System.out.println("--Session Created--"+hs.getCreationTime());
			
			request.setAttribute("r_param1", "this is from First Servlet");
			//response.sendRedirect("welcome");
			RequestDispatcher rd=request.getRequestDispatcher("welcome");
			rd.forward(request, response);//
			
		
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
