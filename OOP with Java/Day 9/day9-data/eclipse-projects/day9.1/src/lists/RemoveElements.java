package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveElements {

	public static void main(String[] args) {
		// Create ArrayList of integers & populate it. :
		// {10,20,1,2,3,45,10,23,-19,45,10,67}
		ArrayList<Integer> intList = new ArrayList<>();// size =0,capa=10
		int[] data = { 10, 20, 31, 25, 39, 45, 10, 23, -19, 45, 10, 67 };
		System.out.println("Array contents " + Arrays.toString(data));
		// copy data from array --> AL
		for (int i : data)// i=data[0]......i=data[data.length-1]
			intList.add(i);// int --> Integer
		System.out.println(" AL contents : " + intList); // containing dups, ordered BUT un sorted
		// remove the elems > 20
//		for (int i = 0; i < intList.size(); i++) {
//			if (intList.get(i) > 20) // auto un boxing
//				intList.remove(i);
//		}
//		System.out.println(" AL content post removal  : " + intList);
		
	}
}
