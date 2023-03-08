package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Product;
import com.app.service.IProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private IProductService service;

	@GetMapping
	public List<Product> getProducts() {
		System.out.println("in get products...");
		return service.getAllProducts();
	}

	@GetMapping("/byId")
	public Product getProductByIDReqParam(@RequestParam int pid) {
		System.out.println("in get product by id..." + pid);
		return service.getProductById(pid);
	}

	@GetMapping("/name/{nm}")
	public Product getProductByName(@PathVariable String nm) {
		System.out.println("in get product by nm " + nm);
		return service.getProductByName(nm);
	}

	@GetMapping("/{product_id}")
	public Product getProductByIDPathVar(@PathVariable(name = "product_id") int pid) {
		System.out.println("in get product by id using path var..." + pid);
		boolean flag=false;
		if (flag)
			throw new RuntimeException("some dummy exc.....");
		return service.getProductById(pid);
	}

	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}

}
