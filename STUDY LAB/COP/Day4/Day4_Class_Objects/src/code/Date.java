package code;

public class Date {

	
	//data members
	private int day,month,year;//instance variable
	
	//constructor:to initialized data members
	//constr name must  be same as class name
	//no return type not even void
	
	//no argument:default constr
	public Date()//default constr
	{
		
		System.out.println("---date class default constr get invoked----");
		day=1;
		month=6;
		year=1990;
		
	}
	//parameterised constr
	
	public Date(int d,int m,int y)
	{
		System.out.println("-----parameterised constr-----");
		day=d;
		month=m;
		year=y;
		
	}
	
	
	
	//methods
	public void printDate()
	{
		System.out.println("Date:"+day+"-"+month+"-"+year);
	}
	//write a method to assign values to data memebrs
	public void assignDate(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
		
	}
}
