package iacsd.code;

public class TestIacsdEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//accessing class in same package
		
		IacsdEmp emp=new IacsdEmp(202, "Sonali", 30000);
		emp.adharNo=909090;//can access out side but in same pkg
		emp.salary=40000;//can access out side class but in same pkg
		emp.calSalary();
		emp.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
