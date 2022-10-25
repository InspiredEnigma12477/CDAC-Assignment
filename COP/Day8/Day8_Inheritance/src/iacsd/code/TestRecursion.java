package iacsd.code;

public class TestRecursion {
	
	public void display(int i)
	{
		System.out.println("--display---"+i);
	if(i<=10)
	{
		display(++i);
		
	}
	//i++;
	}
	public static void print()
	{
		
	}
	public static void main(String[] args) {
		//print();//static can get access in static
		TestRecursion obj=new TestRecursion();
		obj.display(1);
		
		
		
		
		IacsdEmp emp=new IacsdEmp();
		
		IacsdEmp[] arr=new IacsdEmp[2];
		arr[0]=emp;		
		arr[1]=new IacsdEmp();
		
		int[] arr1=new int[2];
		int a=10;
		arr1[0]=a;
		arr1[1]=90;
		
		
		
		
		
		
		
	}

}
