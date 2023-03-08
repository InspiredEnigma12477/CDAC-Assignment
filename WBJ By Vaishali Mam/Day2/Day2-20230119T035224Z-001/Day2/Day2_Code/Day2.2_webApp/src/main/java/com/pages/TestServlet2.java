package com.pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//http://localhost:8080/Day2.2_webApp/test2
//default loadOnStartup=-1 lazy :when requested then life cyle start
// loadOnStartup=1(any positive number) eager :at the time of app deployment life cyle start
@WebServlet(value="/test2",loadOnStartup = 1)
public class TestServlet2 extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("--inside init  TestServlet2----");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	super.doGet(req, resp);
		System.out.println("--inside doGet  TestServlet2----");
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("--inside destroy  TestServlet2----");
	}

	
	
	

}
