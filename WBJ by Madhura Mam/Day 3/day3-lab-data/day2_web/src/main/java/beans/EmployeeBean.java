package beans;

import java.util.List;

import dao.EmployeeDaoImpl;
import pojos.Department;
import pojos.Employee;

public class EmployeeBean {
	//state : clnt state(rq params)
	private String dept;
	private double salary;
	private EmployeeDaoImpl empDao;
	public EmployeeBean() {
		empDao=new EmployeeDaoImpl();
		System.out.println("emp bean created!");
	}
	//setters n getters
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmployeeDaoImpl getEmpDao() {
		return empDao;
	}
	public void setEmpDao(EmployeeDaoImpl empDao) {
		this.empDao = empDao;
	}
	//B.L method to get emp list from dao layer
	public List<Employee> fetchEmpList()
	{
		System.out.println("in JB B.L method "+dept+" "+salary);
		//invoke dao's method 
		return empDao.getEmpsByDeptAndSalary
				(Department.valueOf(dept), salary);
	}
	

}
