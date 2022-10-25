package code;

public class MyMath {
//BL
	
	
	//bl for chking odd or even write in named block:function/method
	
	public  void  chkEven(int  no)
	{
		if(no%2==0)
			System.out.println("even");
		else
			System.out.println("odd ");
	}
	
	public int getMax(int no1,int no2)
	{
		if(no1>no2)
			return no1;
		else
			return no2;
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition="+c);
	}
	
//	public void add3(int i,int j,int k)
//	{
//		System.out.println("Add(i,j,k)="+(i+j+k));
//	}
//	
//	public void addDouble(double d1,double d2)
//	{
//		System.out.println("Add(double,double)="+(d1+d2));
//	}
	//mthod overloading:same fun name but with  diff signature
	//Number of arguments passed to a function.
	//Data types of arguments.
	//Sequence in which they are passed.
//Note:return data type not considered in overloading
	public void add(int i,int j,int k)
	{
		System.out.println("Add(i,j,k)="+(i+j+k));
	}
	
	public void add(double i,double j)
	{
		System.out.println("Add(i,j)="+(i+j));
	}
	public void add(int i,double j)
	{
		System.out.println("Add(i,j)="+(i+j));
	}
	public void add(double i,int j)
	{
		System.out.println("Add(i,j)="+(i+j));
	}

	//error
//	public double add(double i,double j)
//	{
//		System.out.println("Add(i,j,k)="+(i+j));
//	}

//fixed signature:accepting only one argument
	public void display(String name)
	{
		System.out.println("Welcome:"+name);
	}
	
	public void addInt(int[] a) {}
	//dynamic signature
	//accept zero or many arguments
	public void sum(int... a)
	{
		System.out.println("Size="+a.length);
		int s=0;
		for(int i:a)
		{
			s=s+i;
		}
		System.out.println("sum of ["+a.length+"] variables="+s);
	}
	
	public void show(String name,String... skills)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
