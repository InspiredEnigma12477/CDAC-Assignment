package iacsd;

public class Student {
	
	//data members:used for description
	//tight encapsulation
	//
	private int rollno;//instance var
	private String name;//instance var
	private int total;//instance var
	
	
	//behaviour:methods
	public void acceptInformation(int no,String nm,int tot)
	{
		System.out.println("----accepting info-----");
		rollno=no;
		name=nm;
		total=tot;
		
	}
	public void display()
	{
		int x=0;
		System.out.println(x);//method level local var
		System.out.println("Students Details");
		System.out.println(rollno+"  "+name +"   "+total);
	}
	

}
