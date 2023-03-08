package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	// add request handling method to show admin details
	@GetMapping("/details")
	public String showCustomerDetails() {
		System.out.println("in cust details");		
		return "/admin/details";
	}

}
