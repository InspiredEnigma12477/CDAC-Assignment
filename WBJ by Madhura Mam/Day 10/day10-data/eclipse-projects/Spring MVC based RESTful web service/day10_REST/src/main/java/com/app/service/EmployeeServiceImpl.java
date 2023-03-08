package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	//dep : dao layer i/f
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmpDetails() {
		return empRepo.findAll();
	}
	@Override
	public Employee addEmpDetails(Employee transientEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(transientEmp);
	}
	@Override
	public String deleteEmpDetails(Long empId) {
		// chekc if emp exists by id
		if(empRepo.existsById(empId)) 
		{
			empRepo.deleteById(empId);
			return "Emp details deleted ....";
		}
		return "Deletion Failed : Invalid Emp Id !!!!!!!!!!!";
	}
	
	

}
