package Numerical;

import java.util.Scanner;

public class PizzaShop {

	public static void main(String[] args) {
	
		
		System.out.println("Enter what you look for eating");
    	System.out.print("1.Chiken Pizza(270)\n 2.Veg Pizza(180)\n 3.Pizza Burger(230)\n 4.Cold Drink(50)\n 5.Exit");
		
	    
		int Amount =0 ;
		int Total =0;
		int a ;
	
	    do{ 
			
	    	Scanner sc = new Scanner (System.in);
	    	  a = sc.nextInt();
	 		
	 		if(a>5||a<1)
	 			System.out.println("Enter Valid Number");
		
		
		switch (a)
		{
		case 1:
			Amount+=270;
			System.out.println("Chiken Pizza");
			break;
		case 2:
			Amount+=180;
			System.out.println("Veg Pizza");
			break;	
			
		case 3:
			Amount+=230;
			System.out.println("Pizza Burger");
			break;
			
		case 4:
			Amount+=50;
			System.out.println("Cold drink");
			break;	
			
		case 5 :
			Total= Amount;
			System.out.println("Total amount ="+Total);
			break;
			
		}
	}while(a!=5);
	}
}
