package tester;

import code.Account;

public class TestArrayRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[3];//store 5 values
		//0 0  0
		arr[0]=10;
		//create array of Account
		Account[] axisBank=new Account[5];//store ref
		
		
		for(Account a:axisBank)
		{
			System.out.println(a);
		}
		
		//assign 
		Account act1=new Account();
		axisBank[0]=act1;
		
		Account act2=new Account(303, "Tejas", 70000);
		axisBank[1]=act2;
		
		axisBank[2]=new Account(404, "Smita", 30000);
		axisBank[3]=new Account(405, "Asmita", 20000);
		axisBank[4]=new Account(406, "Mita", 50000);
		System.out.println("---------------");
		for(Account a:axisBank)
		{
		//	System.out.println(a.hashCode());
			a.displayDetails();
		}
		
		
		
	}

}
