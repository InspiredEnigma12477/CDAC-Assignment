package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Mandatory : To tell SC following is a spring bean containing req handling logic
//Req hanlding controller : handler bean : managed by SC
//singleton n eager
public class HelloWorldController {
	public HelloWorldController() {
		System.out.println("in ctor of " + getClass());
	}

	@PostConstruct
	public void myInit() {
		System.out.println("in init of "+getClass());
	}
	@RequestMapping(value="/hello") //mandatory method level anno for mapping incoming 
	//request to a specific method of the specif controller
	public String sayHello()
	{
		System.out.println("in say hello");
		return "/welcome";//Handler rets LVN(logical=forward , view name) --> D.S
	}
}
