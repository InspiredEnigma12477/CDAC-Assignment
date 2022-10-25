package com.tester;

import com.code.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp;
		emp=new Employee();//default constr
		
		System.out.println(emp.hashCode());
		emp.printEmployeeDetails();
		
		Employee emp2=new Employee();
		System.out.println(emp2.hashCode());
		emp2.printEmployeeDetails();
		
		
		Employee emp3=new Employee(303, "Ramesh", "Mumbai", "r@gmail.com", 29, 40000);
		emp3.printEmployeeDetails();//
		
		Employee emp4=new  Employee(404, "Nita", "Pune", "n@gmail.com", 40, 60000);
		System.out.println(emp4.hashCode());
		emp4.printEmployeeDetails();
			
//		public Employee(int empid,String name,String address,String email ,int age,double salary)
//		{
//			System.out.println("---parameterised constr-----");
//			this.empid=empid;
//			this.name=name;
//			this.address=address;
//			this.age=age;
//			this.email=email;
//			this.salary=salary;
//		}

	
	
	
	}
	

}
