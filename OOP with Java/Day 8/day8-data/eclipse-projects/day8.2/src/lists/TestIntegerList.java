package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Objectives in Integer list
0. Create ArrayList of integers & populate it.
1. check if element exists in the list.
2. disp index of 1st occurance of the elem
3. double values in the list --if elem val > 20
4. remove elem at the specified index
5. 
6. sorting
 */
public class TestIntegerList {

	public static void main(String[] args) {
		// Create ArrayList of integers & populate it. :
		// {10,20,1,2,3,45,10,23,-19,45,10,67}
		ArrayList<Integer> intList = new ArrayList<>();// size =0,capa=10
		System.out.println("Def AL contents : "); // empty list no o/p : since it iterates over size
		for (int i : intList)// auto un boxing
			System.out.println(i);
		int[] data = { 10, 20, 1, 2, 3, 45, 10, 23, -19, 45, 10, 67 };
		System.out.println("Array contents " + Arrays.toString(data));
		// copy data from array --> AL
		for (int i : data)// i=data[0]......i=data[data.length-1]
			intList.add(i);// int --> Integer
		System.out.println(" AL contents : " + intList); // containing dups, ordered BUT un sorted
		intList.add(12345);
		System.out.println(" AL contents : " + intList);
		// check if element exists in the list.
		Integer tmp = 101;// auto boxing
		System.out.println(intList.contains(tmp) ? "Present" : "Absent");
		// disp index of 1st occurance of the elem : indexOf
		// API of AL : public int indexOf(Object elem)
		System.out.println("index of 1st occur of 45 : " + intList.indexOf(45) + "index of last occur of 45:"
				+ intList.lastIndexOf(45));// auto boxing --> up casting
		// double values in the list --if elem val > 20
		// API :public E get(int index) : gets the elem by specified index
		// public E set(int index,E newElem) : replaces the elem by new elem , at
		// specified pos.
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i) > 20) // auto un boxing
				System.out.println("Replaced " + intList.set(i, intList.get(i) * 2));
		}
		System.out.println("List after replace " + intList);
		// remove elem at the specified index
		System.out.println("Removed "+intList.remove(2));
		System.out.println("List after remove " + intList);
		Collections.sort(intList);
		System.out.println("List after sorting " + intList);

	}
}
