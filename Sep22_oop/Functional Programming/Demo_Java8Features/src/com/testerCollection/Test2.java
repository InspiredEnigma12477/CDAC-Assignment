package com.testerCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(23, 4, 5, 66, 23, 45, 6, 7, 8, 97, 45));
		System.out.println("Orignal List=");
		list.forEach(no->System.out.print(no+" "));
		
		//to remove all odd numbers from AL
		//use iterator and call itr.remove()
		
		//java 8
		
		//removeIf(Predicate)
		//Predicate in fun i/f having SAM test
		System.out.println();
//		Predicate<Integer> pre=(no)->{if(no%2!=0)
//			return true;
//		return false;
//		};
		
	//	list.removeIf(pre);
		list.removeIf(no->{return no%2!=0? true: false;});
		System.out.println("---After Removinf odd numbers------");
		list.forEach(no->System.out.print(no+" "));
		
		System.out.println("\n----now sort list-----");
		list.sort((o1,o2)->( (Integer)o1).compareTo(o2));
		list.forEach(no->System.out.print(no+" "));
		
		 
		
		
		
		
	}

}
