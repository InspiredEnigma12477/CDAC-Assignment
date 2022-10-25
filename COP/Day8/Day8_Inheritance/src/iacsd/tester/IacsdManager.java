package iacsd.tester;
import iacsd.code.IacsdEmp;
public class IacsdManager extends IacsdEmp {

	private int incentives;
	
	public IacsdManager()
	{//parent class constr default
		incentives=1000;
	}
	public IacsdManager(int empid,String name,double salary,int incentives)
	{
		//default constr of emp by default
		//call parameter constr explicitly
		
		super(empid, name, salary);
		this.incentives=incentives;
		
		
	}
	//protected are  accessible in sub-types out side pkgs
	
	public void xyz() {}
	public void calculate() {}
	
	@Override
	  public void calSalary() {
		   System.out.println("Manager Salary="+(salary+incentives));
	   }
	  
	
	public void display()
	   {
		   System.out.println("Manager Display Function");
		   super.display();
			 System.out.println(incentives);  
	   }
}
