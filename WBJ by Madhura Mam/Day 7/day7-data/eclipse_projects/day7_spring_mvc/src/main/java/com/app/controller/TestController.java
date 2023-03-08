package com.app.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test") // optional BUT reco for separation
public class TestController {
	public TestController() {
		System.out.println("in def ctor of " + getClass());
	}

	// add req handling method to test Model n View : to ret dynamic results to view
	// layer via D.S
	@GetMapping("/test1") // @GetMapping => @RequestMapping(method=GET)
	public ModelAndView testModelAndView() {
		System.out.println("in test m n v");
		// ModelAndView(String viewName,String modelAttrName,Object value)
		return new ModelAndView("/test/display", "server_ts", LocalDateTime.now());// Handler rets MnV -->D.S
		// -->LVN --> V.R --> AVN : /WEB-INF/views/test/display.jsp --> D.S
		// saves model attrs under req scope --> forwards the clnt to view layer
	}

	// add req handling method to test Model Map
	@GetMapping(value = "/test2")
	public String testModelMap(Model modelMap) {
		System.out.println("in test model map " + modelMap);// {}
		System.out.println("model map class "+modelMap.getClass());
		modelMap.addAttribute("server_ts", new Date()).addAttribute("number_list", Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("in test model map : after  " + modelMap);// {map populated with model attrs}
		return "/test/display";//Handler rets string(LVN) explicitly --> D.S
		//implicitly sends model map(model attrs) -> D.S --> sends LVN ---> V.R 
		//--> rets AVN --> D.S --> adds model attrs under reqeust scope --> forwards the clnt to view layer
		//AVN : /WEB-INF/views/test/display.jsp

	}

}
