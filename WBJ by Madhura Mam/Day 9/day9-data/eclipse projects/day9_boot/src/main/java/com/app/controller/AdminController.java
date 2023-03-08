package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.CategoryService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private CategoryService categoryService;
	public AdminController() {
		System.out.println("in def ctor "+getClass());
	}
	//URL : http://localhost:8080/day9_boot/admin/main
	//add request handling method to show admin's main page
	@GetMapping("/main")
	public String showAdminDetails()
	{
		System.out.println("in show admin details");
		return "/admin/main";//AVN -- /WEB-INF/views/admin/main.jsp
	}
	//URL : http://localhost:8080/day9_boot/admin/categories
	@GetMapping("/categories")
	public String showCategories(Model map)
	{
		System.out.println("in show categories");
		map.addAttribute("category_list", categoryService.fetchAllCategories());
		return "/admin/categories";//LVN --> AVN : /WEB-INF/views/admin/categories.jsp
	}

}
