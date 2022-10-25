package iacsd.tester;

import iacsd.code.IacsdEmp;

public class TestPayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IacsdEmp emp=new IacsdEmp(202, "Sonali", 30000);
		//emp.adharNo=909090;//default can access out side class but in same pkg outside pkg not accessible
		//emp.salary=40000;//can access out side class but in same pkg outside  pkg not accessible
		emp.calSalary();
		emp.display();
		
	}

}
