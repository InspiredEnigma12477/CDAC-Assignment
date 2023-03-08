package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;



@RestController // = @Controller at the class level + @ResponseBody 
//added on all ret types of
// all req handling methods : for marshalling--ser -java --> json conversion
@CrossOrigin(origins = "http://localhost:3000")//enables CORS header 
@RequestMapping("/employees")
public class EmployeeController {
//dep : service layer i/f
	@Autowired
	private EmployeeService empService;
	public EmployeeController() {
		System.out.println("in def ctor of "+getClass());
	}
	//URL : http://host:port/employees , method=GET
	@GetMapping
	public List<Employee> getEmps()
	{
		System.out.println("in get emps");
		return empService.getAllEmpDetails();
	}
	//URL : http://host:port/employees , method=POST
	@PostMapping
	public Employee saveEmpDetails(@RequestBody Employee emp)
	{
		System.out.println("in save emp "+emp);
		return empService.addNewEmpDetails(emp);
	}
	
}
