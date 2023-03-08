package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	//using a derived finder method
	Optional<Product>findByName(String nm);
	//using named query 
	List<Product> findByPrice(double price);
	
	

}
