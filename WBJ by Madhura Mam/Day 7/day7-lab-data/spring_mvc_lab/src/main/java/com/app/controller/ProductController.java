package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {
	public ProductController() {
		System.out.println("in def ctor of " + getClass());
	}
	//add req handling method to show the form
	@GetMapping("/desc")
	public String showForm()
	{
		System.out.println("in show form");
		return "/products/show_form";//AVN : /WEB-INF/views/products/show_form.jsp
	}
	//add req handling method to process form
	@PostMapping("/desc")
	//SC : String keyword=request.getParamter("keyword");
	public String processForm(@RequestParam String keyword)
	{
		System.out.println("in process form "+keyword);
		return null;
	}
	
	
	
	
	
}
