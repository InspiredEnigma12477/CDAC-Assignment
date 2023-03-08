package com.app.service;

import java.util.List;

import com.app.entities.Employee;

public interface IEmployeeService {
	List<Employee> getAllEmpDetails();

	Employee addEmp(Employee transientEmp);

	String deleteEmp(long empId);

	Employee getEmpDetails(long empId);

	Employee updateEmpDetails(Employee detachedEmp);
}
