package pages;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("---init----"+getClass());
		//get the parameters from web.xml
		
		ServletConfig config=getServletConfig();//servlet specific  paramteres from web.xml
		String p1=config.getInitParameter("param1");
		System.out.println("param1:"+p1);
		System.out.println("No1:"+config.getInitParameter("no1"));
		
		ServletContext ctx=getServletContext();
		System.out.println("Disscount:"+ctx.getInitParameter("disscount"));
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

}
