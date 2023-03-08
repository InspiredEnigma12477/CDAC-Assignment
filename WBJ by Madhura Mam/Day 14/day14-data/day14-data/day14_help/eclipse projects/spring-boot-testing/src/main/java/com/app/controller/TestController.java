package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public  String greeting() {
		System.out.println("in greeting");
		return "Hello, REST !!!!";
	}

}