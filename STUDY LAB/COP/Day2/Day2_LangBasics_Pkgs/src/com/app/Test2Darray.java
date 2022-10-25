package com.app;

import java.util.Scanner;

public class Test2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] arr[3][2];
		System.out.println(true);
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int[][] arr=new int[3][3];
		

		for(int row=0;row<3;row++)//row 0 1 2
		{
			for(int col=0;col<3;col++)
			{
				arr[row][col]=sc.nextInt();
			}
		}
		System.out.println("---------------------");
		
		for(int row=0;row<3;row++)//row 0 1 2
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
