package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
//get all emps
	List<Employee> getAllEmpDetails();
	//add new emp details
	Employee addNewEmpDetails(Employee emp);
}
