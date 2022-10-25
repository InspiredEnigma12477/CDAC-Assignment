package iacsd.code;

public class IacsdEmp {
	int adharNo;
	private int empid;
	private String name;
   protected double  salary;
   
   public IacsdEmp()
   {    
	   System.out.println("--default emp---");
	   empid=101;
	   name="Ram";
	   salary=10000;
   }
   public IacsdEmp(int empid,String  name,double salary)
   {  // super();
	  // this();//default constr of IacsdEmp:constr chaining
	 //super();
	   this.empid=empid;
	   this.name=name;
	   this.salary=salary;
	 
   }
   public void calSalary() {
	   System.out.println("Employee Salary="+salary);
   }
   public void display()
   {
	   System.out.println(empid+"   "+name +"   "+salary);
		   
   }
   @Override
   public String toString()
   {
	   return empid+"     "+name+ "   "+salary;
			   
   }
   
   
   
   
   
   
   
   
   
   
   
}
