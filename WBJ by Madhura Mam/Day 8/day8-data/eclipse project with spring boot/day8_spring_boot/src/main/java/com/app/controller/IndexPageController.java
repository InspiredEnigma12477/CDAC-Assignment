package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {
	public IndexPageController() {
		System.out.println("in def ctor of "+getClass());
	}
	//Add req handling method to forward the clnt to the index page
	@RequestMapping("/")
	public String showIndexPage(Model map)
	{
		System.out.println("in show index page ");
		map.addAttribute("server_ts", new Date());
		return "/index";//Handler rets LVN --> D.S --> V.R --> AVN : /WEB-INF/views/index.jsp
	}

}
