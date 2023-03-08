package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.service.CategoryService;
import com.app.service.ProductService;

@Controller
@RequestMapping("/categories") // allowed at class level. Sub types : @GetMapping/@PostMapping : not allowed
// here!!!!
public class CategoryController {
	// dep : product service layer i/f
	@Autowired // autowire=byType
	private ProductService productService;
	//dep : category service i/f
	@Autowired
	private CategoryService categoryService;

	public CategoryController() {
		System.out.println("in def ctor of " + getClass() + " " + productService);// null
	}

	@PostConstruct
	public void init() {
		System.out.println("in init " + productService);
	}

	// add req handling method to show the form : to choose the category
	@GetMapping("/choose")
	public String showChooseCategoryForm() {
		System.out.println("in show choose cat form");
		return "/category/choose_category";// AVN : /WEB-INF/views/category/choose_category.jsp
	}

	// add req handling method : to process the form
	@PostMapping("/choose")
	public String processChooseCategoryForm(@RequestParam String categoryName,
			Model map)
	// SC : String categoryName=request.getParameter("categoryName");
	// For simplicity : MATCH req param name to method arg name
	// Can SC perform string-> prim type conversion : YES
	// Additionally SC can also perform : string --> date/localdate , string(form
	// data) --> model : server side object
	{
		System.out.println("in process choose category form " + categoryName);
		// invoke service layer method to get products by chosen category name
		map.addAttribute("product_list", 
				productService.getProductsByCategoryName(categoryName));
		return "/category/products";// AVN : /WEB-INF/views/category/products.jsp
	}
	//URL : http://localhost:8080/day9_boot/categories/delete/2
	@GetMapping("/delete/{catId}")
	public String deleteCategory(@PathVariable Long catId,RedirectAttributes flashMap)
	{
		System.out.println("delete category "+catId);
		flashMap.addFlashAttribute("mesg",categoryService.deleteCategory(catId));
		return "redirect:/admin/categories";
	}

}
