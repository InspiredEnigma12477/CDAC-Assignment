package tester;

import code.Date;

public class TestDateConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date d;
		d=new Date();//default constr
		d.printDate();
		
		for(int i=1;i<=10;i++)
		{
		Date d2=new Date();
		System.out.println(d2.hashCode());
		d2.printDate();
		//10 object
		}
	}

}
