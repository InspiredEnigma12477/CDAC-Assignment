package Numerical;

import java.util.Scanner;

public class GretestNum {

	public static void main(String[] args) {
		
		System.out.println("Enter three Numbers");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(a>=b) {
			if(a>c)
				System.out.println("gratest number is"+a);
			else if(a<c)
				System.out.println("greatest number is"+c);
			
		}
		else if(b>=c)
		{
			if(b>c)
				System.out.println("gratest number is"+b);
			else if(b<c)
				System.out.println("greatest number is"+c);
		}
		
		else if(a==b&&b==c)
			System.out.println("All numbers are equal");
			
		
			
	}

}
