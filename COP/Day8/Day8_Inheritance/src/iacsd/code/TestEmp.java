package iacsd.code;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=Integer.valueOf(args[0]);
		int b=Integer.valueOf(args[1]);
		System.out.println((a+b));
		System.out.println(args[0]+args[1]);
		//System.out.println(args[1]);
		
		IacsdEmp emp=new IacsdEmp(102, "Vaishali", 60000);
		System.out.println(emp);//toString()
	
	
		
		
		
		
		
		
		
	}

}
