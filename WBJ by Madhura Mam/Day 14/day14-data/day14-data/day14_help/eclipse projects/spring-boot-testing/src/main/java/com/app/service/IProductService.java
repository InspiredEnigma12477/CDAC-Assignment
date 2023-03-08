package com.app.service;

import java.util.List;

import com.app.pojos.Product;

public interface IProductService {
	List<Product> saveAllProducts(List<Product> products);
	List<Product> getAllProducts();
	Product getProductById(int productId);
	Product addProduct(Product p);
	Product getProductByName(String name);
	List<Product> getAllProductsExceedingPrice(double price);
}
