package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.CategoryDao;
import com.app.dao.ProductDao;
import com.app.pojos.Product;
import com.app.pojos.User;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	// dep : category dao i/f
	@Autowired
	private CategoryDao categoryDao;
	// dep : product dao i/f
	@Autowired
	private ProductDao productDao;

	public CustomerController() {
		System.out.println("in ctor of " + getClass());
	}

	// add req handling method to forward the clnt to show product categories to the
	// clnt
	@GetMapping("/categories")
	public String showCustomerMainPage(Model map) {
		System.out.println("in show cust main page");
		map.addAttribute("category_list", categoryDao.findAll());
		return "/customer/categories";// AVN : /WEB-INF/views/customer/categories.jsp
	}

	// URL : http://localhost:8080/day14_boot/customer/products?categoryId=2
	@GetMapping("/products")
	public String showProducts(@RequestParam long categoryId, Model map) {
		System.out.println("in show products " + categoryId);
		map.addAttribute("product_list", productDao.findByProductCategoryId(categoryId));
		return "/customer/products";// AVN : /WEB-INF/views/customer/products.jsp
	}

	// http://localhost:8080/day15_boot/customer/product_details?pid=5
	// add a method to show selected product details
	@GetMapping("/product_details")
	public String showSelectedProductDetails(@RequestParam long pid, Model map) {
		System.out.println("in show prod dtls " + pid);
		Product product = productDao.findById(pid)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Product ID !!!!!!"));
		map.addAttribute("product_dtls", product);
		return "/customer/product_details";// AVN : /WEB-INF/views/customer/product_details.jsp

	}

	// http://localhost:8080/day15_boot/customer/add_to_cart?quantity=10"
	// add a method to add the selected product in the cart (Later !)
	@GetMapping("/add_to_cart")
	public String addProductToCart(@RequestParam int quantity, @RequestParam long productId,
			RedirectAttributes flashMap,HttpSession session) {
		System.out.println("in add to cart " + quantity + " product id " + productId);
		User user=(User) session.getAttribute("user_details");
		flashMap.addFlashAttribute("mesg", "Product with id "+productId+" added to the cart of "+user.getFirstName());
		return "redirect:/customer/categories";
	}

}
