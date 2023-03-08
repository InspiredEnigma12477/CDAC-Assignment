package com.app.dao;

import java.util.List;

import com.app.pojos.Product;

public interface ProductDao {
//add a method to get products with desc having a keyword
	List<Product> getProductsByDesc(String key);
}
