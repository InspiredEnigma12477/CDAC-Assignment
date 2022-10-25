package code;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("----Array Demo-------");
		//int arr[3]; in c and cpp  Data Type :int identifier:arr size:3
		//
		
		//DataType[] identifier
		int[] arr;
		arr=new int[5];//
		
		arr[0]=10;//1st element
		arr[1]=34;//2nd
		arr[2]=54;
		arr[3]=37;
		arr[4]=99;
		System.out.println("Length="+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("\nHow Many element:");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		
		System.out.println("length="+arr1.length);
		System.out.println("enter Number");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("\n-----------------");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n-------adv for loop-------");
		//for each loop
		//foreac points to each and every element from collection
		//starts from first element
		//till last element
		//auto increment and fwd only
		//read only
		for(int no:arr1)//for each number in arr1
		{
			System.out.print(no+"  ");
		}
		
		System.out.println("\n------------search element------------");
		
		System.out.println("eneter Number:");
		int num=sc.nextInt();
		boolean flag=true;
		for(int no:arr1)
		{
			if(no==num)
			{flag=true;
			break;
				//System.out.println("Present");
			}
			else
			{
				flag=false;
				
				//System.out.println("not Present");
			}
		}
		if(flag)
			System.out.println("Present");
		else
			System.out.println("not Present");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
