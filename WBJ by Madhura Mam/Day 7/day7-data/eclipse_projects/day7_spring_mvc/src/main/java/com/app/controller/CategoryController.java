package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/categories") // allowed at class level. Sub types : @GetMapping/@PostMapping : not allowed
				// here!!!!
public class CategoryController {
	public CategoryController() {
		System.out.println("in def ctor of "+getClass());	
	}
	//add req handling method to show the form : to choose the category
	@GetMapping("/choose")
	public String showChooseCategoryForm()
	{
		System.out.println("in show choose cat form");
		return "/category/choose_category";//AVN : /WEB-INF/views/category/choose_category.jsp
	}
	//add req handling method : to process the form
	@PostMapping("/choose")
	public String processChooseCategoryForm(@RequestParam String categoryName)
	//SC : String categoryName=request.getParameter("categoryName");
	//For simplicity : MATCH req param name to method arg name
	//Can SC perform string-> prim type conversion : YES
	//Additionally SC can also perform : string --> date/localdate , string(form data) --> model : server side object
	{
		System.out.println("in process choose category form "+categoryName);
		return null;
	}

}
