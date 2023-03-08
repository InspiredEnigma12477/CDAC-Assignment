package com.pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ./test3
//@WebServlet("/test3")
public class TestServlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("----inside doGet TestServlet3-----");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("----inside destroy TestServlet3-----");

	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("----inside init TestServlet3-----");

	}

}
