package com.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test3 {
//create stream from collection
	
	public static void main(String[] args) {
		
	
	List<Integer> intList=Arrays.asList(44,67,2,12,44,67,89,60,100,1,45,78);
	System.out.println("Orignal List:");
	
	intList.forEach(i->System.out.print(i+" "));
	System.out.println("\n-------data from stream-------");
	intList.stream()//collection--->stream
	.forEach(i->System.out.print(i+" "));
	
	System.out.println("\n---------------------");
	
	intList.parallelStream().forEach(i->System.out.print(i+" "));
	
	System.out.println("\n---------max------------");
	
    Optional<Integer> max=	intList.stream()//collection-->stream
	.max((a,b)->((Integer)a).compareTo(b));//terminal
	
	System.out.println("Max:"+max.get());
	
	
	System.out.println("------sort intList----------");
	
	intList.stream()//stream
	.sorted()//intermediate op
	.forEach(i->System.out.print(i+" "));
	
	System.out.println("\n--------even-----------");
	intList.stream()//stream
	.filter(i->i%2==0)//filter stream
	//.sorted()//sort filtered stream
	.forEach(i->System.out.print(i+" "));
	
	
	//show even in ascending
	System.out.println("\n--------even-with sorting----------");
	intList.stream()//stream
	.filter(i->i%2==0)//filter stream
	.sorted()//sort filtered stream
	.forEach(i->System.out.print(i+" "));
	
	
	
	System.out.println("\n--------odd-with sorting----------");
	//Adv Assignment:Do in LAB
	intList.stream()//
	.filter(i->i%2!=0)//
	.forEachOrdered(i->System.out.print(i+"  "));
	
	
	
	
	
	
	
	
	}
}
