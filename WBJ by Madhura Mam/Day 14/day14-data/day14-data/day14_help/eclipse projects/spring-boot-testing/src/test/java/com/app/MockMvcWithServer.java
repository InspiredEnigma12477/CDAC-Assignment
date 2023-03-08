package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.app.pojos.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

//creates a web app context (SC) using any available random free port.
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc

class MockMvcWithServer {
	// randomly available free port is injected in local server port
	@LocalServerPort
	private int serverPort;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper mapper;

	@Test
	public void testTestConroller() throws Exception {

		MvcResult result = mockMvc.perform(get("/test"))
				.andDo(print()).
				andExpect(status().isOk()).
				andReturn();
		assertEquals("Hello, REST !!!!", result.getResponse().getContentAsString());

	}

	@Test
	public void testGetProductByIDPathVar() throws Exception {
		mockMvc.perform(get("/products/2")).
		andExpect(status().isOk()).
		andDo(print())
				.andExpect(jsonPath("$.price").value(200));
	}

	@Test
	public void testAddProduct() throws Exception {
		Product product = new Product("oil", 200, LocalDate.parse("2021-08-08"));
		MvcResult result = mockMvc
				.perform(post("/products").contentType(MediaType.APPLICATION_JSON)
						.content(mapper.writeValueAsString(product)))
				.andDo(print()).andExpect(status().isOk()).andReturn();
		// check product id of the latest added product from product table under DB n then set it's id
		product.setProductId(1);
		assertEquals(mapper.writeValueAsString(product), result.getResponse().getContentAsString());
	}

	@Test
	public void testAddProductWithJson() throws Exception {
		Product product = new Product("biscuits", 130, LocalDate.parse("2021-11-08"));
		mockMvc.perform(
				post("/products").contentType(MediaType.APPLICATION_JSON).
				content(mapper.writeValueAsString(product)))
				.andDo(print()).
				andExpect(status().isOk()).
				andExpect(jsonPath("$.name").value("biscuits2"));

	}

}
