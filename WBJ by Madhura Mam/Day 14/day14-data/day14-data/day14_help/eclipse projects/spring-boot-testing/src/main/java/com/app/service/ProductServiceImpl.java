package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ProductRepository;
import com.app.pojos.Product;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductRepository repo;
	
	

	@Override
	public List<Product> saveAllProducts(List<Product> products) {
		// TODO Auto-generated method stub
		return repo.saveAll(products);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return repo.findById(productId).get();
	}

	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Product getProductByName(String name) {
		Optional<Product> optional = repo.findByName(name);
		return optional.orElseThrow(() -> new RuntimeException("Product Not found : Invalid Product Name"));

	}

	@Override
	public List<Product> getAllProductsExceedingPrice(double price) {
		// TODO Auto-generated method stub
		return repo.findByPrice(price);
	}
	

}
