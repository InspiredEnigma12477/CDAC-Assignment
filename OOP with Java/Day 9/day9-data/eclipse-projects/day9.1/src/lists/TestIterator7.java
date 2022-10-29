package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator7 {

	public static void main(String[] args) {
		// Create ArrayList of integers & populate it. :
		// {10,20,1,2,3,45,10,23,-19,45,10,67}
		ArrayList<Integer> intList = new ArrayList<>();// size =0,capa=10
		int[] data = { 10, 20, 31, 25, 39, 45, 10, 23, -19, 45, 10, 67 };
		System.out.println("Array contents " + Arrays.toString(data));
		// copy data from array --> AL
		for (int i : data)// i=data[0]......i=data[data.length-1]
			intList.add(i);// int --> Integer
		//display list elems in reverse order : ListIterator
		//1. Attach ListItr : after the last elem
		System.out.println("Printing list contents in rev order");
		ListIterator<Integer> listItr=intList.listIterator(intList.size());
		System.out.println(listItr.getClass());
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
		
		
	}
}
