package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional//readOnly: false
public class EmployeeServiceImpl implements EmployeeService {
	//dep : dao layer i/f
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public List<Employee> getAllEmpDetails() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}

	@Override
	public Employee addNewEmpDetails(Employee emp) {
		// TODO Auto-generated method stub
		return empRepository.save(emp);
	}
	

}
