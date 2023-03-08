package com.app;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.app.controller.ProductController;
import com.app.pojos.Product;
import com.app.service.IProductService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(controllers = ProductController.class) // Mainly for testing only Spring MVC components
//In this case , configures only ProductController class n no other beans
class ProductControllerTest {
	@Autowired
	private ProductController controller;
	@Autowired
	private MockMvc mockMvc;// entry point to testing MVC : simulates HTTP requests.

	@MockBean // replaces ProductService by it's mock (method are not delegated to actual
				// implementation class)
	private IProductService service;
	@Autowired
	private ObjectMapper mapper;// Jackson supplied class for JSON processing.

	@Test
	void sanityTest() {
		assertNotNull(controller);// To confirm if ProductController is autowired correctly.
	}

	@Test
	public void testGetProductByIDPathVar() throws Exception {
		Product p = new Product("Sweets", 500, LocalDate.now());
		when(service.getProductById(12)).thenReturn(p);
		// performs a request get with path var=12
		mockMvc.perform(get("/products/12")). 
		andExpect(jsonPath("$.name").value("Sweets")). //in resulting JSON : checks key name n asserts its value 
		andExpect(status().isOk());//chks if HttpStatus is OK
	}

	@Test
	public void testAddProduct() throws Exception {
		Product p = new Product("grain", 100, LocalDate.now());//hard coding product details
		p.setProductId(100);
		//when mocked service's addProduct method is called : then it will return : p
		when(service.addProduct(any(Product.class))).thenReturn(p); 
		mockMvc.perform(post("/products"). //performs a post request
				content(jsonString(p)). //setting request body as p
				contentType(MediaType.APPLICATION_JSON)) //setting request's content type header
				.andExpect(status().isOk()).//chks if HttpStatus is OK
				andExpect(jsonPath("$.name").value("grain"))//in the response : json key(product name) : grain
				.andExpect(jsonPath("$.productId").value(100));
	}

	public String jsonString(Object obj) throws Exception {

		return mapper.writeValueAsString(obj);

	}

}
