package com.code;

import static java.lang.Math.*;
//import static  is used for static methods or static data members
import static java.lang.System.out;

public class MyMath {

	public static void swap(int i, int j) {
		
		
		int temp=i;//temp=10
		i=j;//i=20
		j=temp;//j=10
		System.out.println("inside swap values "+i +"  "+j);//20  10
//		int a = max(90, 10);
//		out.println(a);
//
//		// Math.pow(2,3);
//
//		out.println(pow(2, 3));
//		

	}
	public static void swapByRef(int[] arr)	
	{
		System.out.println("Working on ref:"+arr.hashCode());
		
		int temp=arr[0];//temp=10
	arr[0]=arr[1];//arr[0]=20
	arr[1]=temp;//j=10
	System.out.println("inside swap values "+arr[0] +"  "+arr[1]);//20  10

		
	}

}
