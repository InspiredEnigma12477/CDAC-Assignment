package com.app.service;

import java.util.List;

import com.app.pojos.Product;

public interface ProductService {
	//add a method to get all products by a category name
		List<Product> getProductsByCategoryName(String categoryName);

}
