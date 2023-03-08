package com.pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//http://localhost:8080/Day2.2_webApp/test1
//requesting :/test1
//def http method :get  
//doGet
@WebServlet("/test1")
public class TestServlet extends HttpServlet
{
	//at the time web deployment
	//W C creates empty map: key and value
	//key:/test1
	//value:com.pages.TestServlet

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("---inside goGet method of TestServlet----");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//super.destroy();
		System.out.println("---inside destroy method of TestServlet----");
		
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		System.out.println("---inside init method of TestServlet----");
	}

}
