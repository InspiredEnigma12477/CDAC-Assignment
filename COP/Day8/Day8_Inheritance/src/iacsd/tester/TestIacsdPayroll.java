package iacsd.tester;

import iacsd.code.IacsdAdmin;
import iacsd.code.IacsdEmp;

public class TestIacsdPayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IacsdManager mgr1 = new IacsdManager();
		mgr1.display();
		
		IacsdManager mgr2=new  IacsdManager(676, "Tejas", 60000, 4000);
		
		mgr2.display();//parent
		
		IacsdEmp emp=new IacsdEmp(455, "Sham", 2000);
		emp.calSalary();//emp
		
		IacsdManager mgr3=new IacsdManager(898, "Amit", 80000, 70000);
		mgr3.calSalary();//manager
		
		
		
		IacsdAdmin admin=new IacsdAdmin();
		admin.calSalary();
		
		
		//
		
		IacsdEmp[] iacsd=new  IacsdEmp[3];
		iacsd[0]=emp;
		iacsd[1]=mgr2;
		iacsd[2]=admin;
		System.out.println("--------------------------");
		for(int i=0;i<iacsd.length;i++)
		{
			iacsd[i].calSalary();
		
		}
		
		
		

	}

}
