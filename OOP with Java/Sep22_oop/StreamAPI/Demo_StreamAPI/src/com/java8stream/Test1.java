package com.java8stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Testing IntStream API

		int[] data = { 23, 45, 6, 23, 4, 66, 78, 3, 45, 6 };
		// Arrays.stream(int[])---->IntStream
		IntStream intStream = Arrays.stream(data);

		intStream.forEach(i->System.out.print(i+"  "));
		
		System.out.println("\n-------even-----------");
		//intStream.forEach(i->System.out.print(i+"  "));//Run time error
		IntStream obj=Arrays.stream(data);
		
		obj.filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		
		System.out.println("\n------odd-----");
		
		IntStream obj2=Arrays.stream(data);
		
		obj2//stream
		.filter(i->i%2!=0)
		.forEach(i->System.out.print(i+"  "));;
		
	//System.out.println("-----------");
		//obj2.forEach(i->System.out.print(i+"  "));//all numbers or odd numbers
		
		
		
		
	}

}
