package code;

public class MyMath {

	public void fun1()
	{
		System.out.println("\nThis is fun1");
		for(int i=0;i<=5;i++)
		{
		System.out.print(i+"  ");	
		}
	}

	public void fun2(int number)
	{
		System.out.println("\nThis is fun2");
		for(int i=0;i<=number;i++)
		{
		System.out.print(i+"  ");	
		}
	}
	public String fun3(int number)
	{
		if(number%2==0)
			return "even";
		else
			return "odd";
	}
	public String fun4()
	{
		return "This is fun4";
	}
}
