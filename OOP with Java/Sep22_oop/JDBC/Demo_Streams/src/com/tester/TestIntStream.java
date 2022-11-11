package com.tester;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.*;

public class TestIntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 23, 4, 5, 6, 734, 34, 53, 52, 9, 20, 1 };

		// convert array into Stream
	IntStream intStrm = Arrays.stream(arr);
		//display all elments from stream
		
		
		intStrm.forEach(i->System.out.print(i+" "));
		
		//operation;sort,max,min,sum,avg,filter
		intStrm = Arrays.stream(arr);
		//function literal
		System.out.println("\n----odd-----");
		IntConsumer cons=(i)->System.out.print(i+" ");
		
		//filter:get only odd number
		intStrm.filter(p->p%2!=0).forEach(cons);
		
		 //sort odd numbres
		System.out.println("\n sorted odd numbers----");
		intStrm = Arrays.stream(arr);
		//intStrm.filter(p->p%2!=0).sorted().forEach((i)->System.out.print(i+" "));
		
		intStrm.sorted().filter(p->p%2!=0).filter(p->p>20).forEach((i)->System.out.print(i+" "));
		
		//make sum ,max,min,avg
		
		intStrm = Arrays.stream(arr);
		System.out.println("\n---sum-----");
		
		
	System.out.println("Sum="+intStrm.sum());
	intStrm = Arrays.stream(arr);
	System.out.println("Max="+intStrm.max().getAsInt());
	intStrm = Arrays.stream(arr);
	
	System.out.println("Min="+intStrm.min().getAsInt());
	intStrm = Arrays.stream(arr);
	System.out.println("Avg"+intStrm.average().getAsDouble());
		
	}

}
