package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor of "+getClass());
	}
	//add req handling method to deliver index page
	@RequestMapping("/")
	public String showHomePage()
	{
		System.out.println("in show home page");
		return "/index";//Handler rets LVN --> D.S --> V.R (ViewResolver) --> AVN : /WEB-INF/views/index.jsp
	}

}
