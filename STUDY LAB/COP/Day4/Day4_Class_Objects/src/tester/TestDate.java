package tester;
import code.Date;
import iacsd.Student;

import java.util.Scanner;
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		System.out.println(a);
		
		//Use Date Class
		Date dob;//dob is ref variable
		dob=new Date();//
		
		System.out.println(dob);//implicitly calling toString() method of Object class
		System.out.println(dob.hashCode());
		dob.printDate();//
		
		System.out.println("Enter Day Month Year");
		Scanner sc=new Scanner(System.in);
		
		Date d1=new Date();
		d1.assignDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
		d1.printDate();
		//or
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();		
		//d1.assignDate(d, m, y);//funtions need to call explicitlty
		d1.printDate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
