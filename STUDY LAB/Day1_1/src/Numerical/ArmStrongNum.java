package Numerical;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int sum=0;
		int rem;
		int temp=a;
	
		while(temp>0);
		{  
			rem = temp%10;
			sum=sum+(rem*rem*rem);
			temp=(temp/10);
		}
		if(sum==a)
		System.out.println("It is armstrong number");
		else
			System.out.println("It is not armstrong number");
	}

}
