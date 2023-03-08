package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // => MANDATORY --spring bean containing req handling logic(P.L)
public class WelcomeController {
	public WelcomeController() {
		System.out.println("in ctor of " + getClass());
	}
	//add req handling method to generate dyn contents(timestamp)
	@RequestMapping("/")
	public String showWelcomePage(Model map)
	{
		System.out.println("in show welcome page "+map);//{} => empty map
		//API of o.s.ui.Model --public Model addAttribute(String nm,Object val)
		map.addAttribute("server_date", new Date());
		return "/index";//Handler rets LVN --> D.S (implicitly rets model map)
		//sends LVN --> V.R --> AVN : /WEB-INF/views/index.jsp --> D.S chks for 
		//model attributes --YES --request.setAttribute("server_date", new Date())
		//--> forwards to view layer.
	}
}
