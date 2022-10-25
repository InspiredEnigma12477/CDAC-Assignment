package com.app;

import java.util.Scanner;

public class TestArrayOperations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter How Many Element:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int ch;
		int index = 0;
		System.out.println("1:insert element  2:Display Array 3:search 4:exit");
		do {
			System.out.println("Enter Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if(index<arr.length)
				{
				System.out.println("enter Number for Index:"+index);
				arr[index] = sc.nextInt();
				index++;
				}
				else
				{
					System.out.println("Array Is Full");
				}
				break;
			case 2:
				System.out.println("----Display Array------");
//				for(int no:arr)
//				{
//					if(no!=0)
//					System.out.println(no+" ");
//				}
				for(int i=0;i<index;i++)
				{
					System.out.print(arr[i]+"   ");
				}
				break;
			case 3:
				for(int i=0;i<index;i++)
				{
					for(int j=0;j<i;j++)
					{
						if(arr[i]<arr[j])
						{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						}
					}
								
					
				}
				for(int i=0;i<index;i++)
				{
					System.out.print(arr[i]+"   ");
				}
				break;
			case 4:
				break;
			}
		} while (ch != 4);

	}

}
