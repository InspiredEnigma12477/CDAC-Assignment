package com.lambdaExpr;

import java.util.ArrayList;

public class EmpUtil {
public static ArrayList<Employee> addEmployee()
{
	ArrayList<Employee> allEmp=new  ArrayList<Employee>();
	
	allEmp.add(new Employee(201, "Dinesh", "Pune", 90000));
	
	allEmp.add(new Employee(301, "Suresh", "Mumbai", 67000));
	
	allEmp.add(new Employee(101, "Nitesh", "Nashik", 8000));
	
	allEmp.add(new Employee(305, "Anil", "Pune", 9500));
	
	allEmp.add(new Employee(671, "Chetan", "Thane", 70000));
	return allEmp;
	
}
}
