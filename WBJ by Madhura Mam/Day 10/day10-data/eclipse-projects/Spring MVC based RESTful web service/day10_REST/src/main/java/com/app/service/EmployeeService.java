package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
//get all emps
	List<Employee> getAllEmpDetails();

	Employee addEmpDetails(Employee transientEmp);

	String deleteEmpDetails(Long empId);
}
