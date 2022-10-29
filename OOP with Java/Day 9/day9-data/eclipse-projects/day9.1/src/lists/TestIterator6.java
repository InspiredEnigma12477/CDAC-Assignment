package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestIterator6 {

	public static void main(String[] args) {
		// Create ArrayList of integers & populate it. :
		// {10,20,1,2,3,45,10,23,-19,45,10,67}
		ArrayList<Integer> intList = new ArrayList<>();// size =0,capa=10
		int[] data = { 10, 20, 31, 25, 39, 45, 10, 23, -19, 45, 10, 67 };
		System.out.println("Array contents " + Arrays.toString(data));
		// copy data from array --> AL
		for (int i : data)// i=data[0]......i=data[data.length-1]
			intList.add(i);// int --> Integer
		// display AL contents using explicit Iterator
		// 1 Attach Iterator to AL : placing it before the 1st element
		System.out.println("Printing AL contents using Iterator");
		Iterator<Integer> itr = intList.iterator();
		//Above method :iterator() rets instance of the private inner class that imple Iterator i/f
		//name : ArrayList$Itr
		//can u add the elem in the list : yes
	//	intList.add(33456);	
		intList.remove(0);
	//	intList.set(0, 9999);
	//	 itr = intList.iterator();
		while (itr.hasNext())
			System.out.println(itr.next()); //throws : ConcurrentModificationExc

	}
}
