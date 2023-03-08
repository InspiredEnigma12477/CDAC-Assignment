package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.CategoryService;
import com.app.service.ProductService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	// dep : product service i/f
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;

	// add req handling method to show the form : to choose the category
	@GetMapping("/choose_category")
	public String showChooseCategoryForm(Model map) {
		System.out.println("in show choose cat form");
		map.addAttribute("category_list", categoryService.fetchAllCategories());
		return "/customer/choose_category";// AVN : /WEB-INF/views/customer/choose_category.jsp
	}

	// add req handling method : to process the form
	@PostMapping("/choose")
	public String processChooseCategoryForm(@RequestParam String categoryName, Model map)
	// SC : String categoryName=request.getParameter("categoryName");
	// For simplicity : MATCH req param name to method arg name
	// Can SC perform string-> prim type conversion : YES
	// Additionally SC can also perform : string --> date/localdate , string(form
	// data) --> model : server side object
	{
		System.out.println("in process choose category form " + categoryName);
		// invoke service layer method to get products by chosen category name
		map.addAttribute("product_list", productService.getProductsByCategoryName(categoryName));
		return "/categories/products";// AVN : /WEB-INF/views/category/products.jsp
	}

}
