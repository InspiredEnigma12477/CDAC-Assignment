package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Category;
import com.app.service.CategoryService;
import com.app.service.ProductService;

@Controller
@RequestMapping("/categories") // allowed at class level. Sub types : @GetMapping/@PostMapping : not allowed
// here!!!!
public class CategoryController {
	// dep : product service layer i/f
	@Autowired // autowire=byType
	private ProductService productService;
	// dep : category service i/f
	@Autowired
	private CategoryService categoryService;

	public CategoryController() {
		System.out.println("in def ctor of " + getClass() + " " + productService);// null
	}	
	
	// URL : http://localhost:8080/day9_boot/categories/delete/2
	@GetMapping("/delete/{catId}")
	public String deleteCategory(@PathVariable Long catId, RedirectAttributes flashMap) {
		System.out.println("delete category " + catId);
		flashMap.addFlashAttribute("mesg", categoryService.deleteCategory(catId));
		return "redirect:/admin/categories";
	}

	// URL : http://localhost:8080/day9_boot/categories/update?catId=2 , method=GET
	@GetMapping("/update")
	public String showUpdateCategoryForm(@RequestParam Long catId, Model map) {
		System.out.println("in show update category form " + catId);
		map.addAttribute("category123", categoryService.getCategoryById(catId));
		return "/category/update";// AVN : /WEB-INF/views/category/update.jsp
	}

	// URL : http://localhost:8080/day9_boot/categories/update?catId=2 , method=POST
	@PostMapping("/update")
	public String processUpdateCategoryForm(@RequestParam Long catId, RedirectAttributes flashMap, 
			 @ModelAttribute(name="category123") Category category) {
		System.out.println("in process update category form " + catId + " " + category);
		flashMap.addAttribute("mesg", categoryService.updateCategory(catId,category));
		return "redirect:/admin/categories";// AVN : /WEB-INF/views/admin/categories
	}
	
	// add req handling method : to process the form
	//URL : http://localhost:8080/day9_boot/categories/show_products?catName=books
		@PostMapping("/show_products")
		public String processChooseCategoryForm(@RequestParam String catName,
				Model map)
		{
			System.out.println("in process choose category form " + catName);//detached category
			// invoke service layer method to get products by chosen category name
			map.addAttribute("product_list", 
					productService.getProductsByCategoryName(catName));
			return "/category/products";// AVN : /WEB-INF/views/category/products.jsp
		}
		
		// URL : http://localhost:8080/day9_boot/categories/add , method=GET
		//Admin adding a new category : show form
		@GetMapping("/add")
		public String showAddCategoryForm(Category category1) {
			//SC : map.addAttribute("category",new Category()); -- model --> view data binding
			System.out.println("in show add category form " +category1);
			return "/category/add";// AVN : /WEB-INF/views/category/add.jsp
		}

		// URL : http://localhost:8080/day9_boot/categories/add , method=POST
		@PostMapping("/add")
		public String processAddCategoryForm(RedirectAttributes flashMap, Category category) {
			System.out.println("in process add category form " + category);//transient category
			flashMap.addAttribute("mesg", categoryService.addCategory(category));
			return "redirect:/admin/categories";// AVN : /WEB-INF/views/admin/categories
		}


	

}
