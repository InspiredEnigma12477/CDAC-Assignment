package generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import static generics.GenUtils.findMaxNumber;


public class Test5 {

	public static void main(String[] args) {
		/*
		 * 1.5 Write a method to find n ret max number from ANY list(AL/LL/Vector) of
		 * any type of numbers (byte/short/int/long....)
		 */
		ArrayList<Integer> l1=new ArrayList<>(List.of(1,2,3,4,45,32,12,10,89,-10));
		System.out.println("max val "+findMaxNumber(l1));
//		l1.set(0,56);
//		System.out.println(l1);
		
		Vector<String> strings=new Vector<>(List.of("avbnv","gfdh","trut"));
	//	System.out.println("max val "+findMaxNumber(strings));
		
		LinkedList<LocalDate> dates=
				new LinkedList<>(List.of(LocalDate.now(),LocalDate.of(2020, 10, 25)));
	//	System.out.println("max val "+findMaxNumber(dates));
		
		ArrayList<Float> l2=new ArrayList<>(List.of(1f,2.5f,3f,4.78f));
		System.out.println("max val "+findMaxNumber(l2));

	}

}
