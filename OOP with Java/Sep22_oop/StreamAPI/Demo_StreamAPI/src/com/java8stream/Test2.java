package com.java8stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Test2 {
public static void main(String[] args) {
	//API:range(10,21)---->10.............20
	IntStream.range(10,21).forEach(i->System.out.print(i+"  "));
	System.out.println("\n----------------");
	 IntStream.range(10,21)//stream
	.filter(i->i%2==0)//filter:intermediate op
	.forEach(i->System.out.print(i+"  "));//terminate op
	System.out.println("\n------------");
	int s= IntStream.range(1,6).sum();
	System.out.println("sum="+s);
	System.out.println("-----------------------");
	IntStream.rangeClosed(10,20).forEach(i->System.out.print(i+"  "));
	
	OptionalInt max= IntStream.rangeClosed(10,20).max();
	System.out.println("\n Max="+max.getAsInt());
	
	//Lab Task:
	//max,min,sum avg for stream
	
}
}
