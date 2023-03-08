package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Product;
import com.app.service.IProductService;

@SpringBootTest
class TestProductService {
	@Autowired
	private IProductService service;

	@Test
	public void addProducts() {
		List<Product> list = List.of(new Product("p1", 400, LocalDate.of(2022, 7, 10)),
				new Product("p2", 290, LocalDate.of(2022, 7, 13)),
				new Product("p3", 350, LocalDate.of(2022, 7, 10)),
				new Product("p4", 390, LocalDate.of(2022, 7, 10)));
		service.saveAllProducts(list).forEach(System.out::println);

	}

	@Test
	public void testGetProductDetails() {
		Product p = service.getProductById(1);
		assertEquals(400, p.getPrice());
	}

	@Test
	public void testNamedQuery() {
		service.getAllProductsExceedingPrice(290).forEach(System.out::println);
	}

}
