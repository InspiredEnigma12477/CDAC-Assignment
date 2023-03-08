package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Mandatory cls level annotation ,to tell SC --following is req handling
			// controller=handler
//singleton n eager : spring bean
public class HomePageController {
	public HomePageController() {
		System.out.println("in def ctor " + getClass());
	}

	// add req handling method to forward the clnt to index page
	// o/p on clnt browser : Welcome 2 Spring MVC @ server time stamp
	@RequestMapping("/")
	public String showIndexPage(Model map) {
		System.out.println("in show index page " + map);// {}
		// Model addAttribute(String attrName.Object attrValue)
		map.addAttribute("server_date", new Date());
		return "/index";// Handler rets explicitly : LVN + implicitly model map --> 
		//D.S -->LVN --> V.R
		// AVN : prefix+LVN+suffix : /WEB-INF/views/index.jsp --> D.S --> add model
		// attr/s under req scope --> forwards to view layer.
	}
}
