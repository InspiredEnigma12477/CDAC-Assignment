package com.app.dao;

import java.util.List;

import com.app.pojos.Product;

public interface ProductDao {
//add a method to get all products by a category name
	List<Product> getProductsByCategoryName(String categoryName);
}
