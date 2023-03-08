package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.service.ServiceImpl1;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private ServiceImpl1 service;

	@Test
	void contextLoads() {
	}

	@Test
	public void testTxPropagation() {
		service.insertFirstAuthor();
	}

}
