package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.HelloBean;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/{name}")
	public HelloBean testMe(@PathVariable String name) {
		//un comment below line to test error handling flow with fron end
	//	throw new RuntimeException("Some error");
		return new HelloBean("Hi ,  " +name+" @ "+ LocalDateTime.now());
	}
}
