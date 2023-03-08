package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.IService1;
import com.app.service.ServiceImpl1;

@RestController
@RequestMapping("/authors")
public class TestController {
	@Autowired
	private IService1 service1;

	@PostMapping
	public String insertAuthors() {
		service1.insertFirstAuthor();
		return "Testing Tx Propagation";
	}
}
