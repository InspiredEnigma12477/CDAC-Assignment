package com.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.pojos.Customer;

@Controller
// mandatory
@RequestMapping("/cust")
// optional
public class CustomerController {
	

	
	@GetMapping("/login")
	public String showLoginForm(Customer cust) {
		System.out.println("in show login form " + cust);

		// map.addAttribute(new Customer());
		return "/cust/login";
	}

	@PostMapping( "/login")
	// public @ResponseBody String processLoginForm(@ModelAttribute("cust123")
	// CustomerPOJO cust) {
	public  String processLoginForm(@Valid Customer cust123, BindingResult result, Model map) {
		System.out.println("in process login form");
		System.out.println("cust details " + cust123);
		// check for P.L validation errs
		if (result.hasFieldErrors("email") || result.hasFieldErrors("password")) {
			System.out.println("p.l errs : in validate");
			return "/cust/login";
		}
		System.out.println("no p.l errs");
		return "/cust/success";
		}

	}
