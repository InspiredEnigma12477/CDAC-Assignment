package com.testerCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(23, 4, 5, 66, 23, 45, 6, 7, 8, 97, 45));
		// display AL

		System.out.println(list);

		// for each loop
		for (int i : list) {
			System.out.print(i + "  ");
		}
		System.out.println();

		// Iterator

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
		}
		System.out.println();

		// Java 8: Collections get added with new method forEach()

		// Consumer<Integer> cons=(a)->{System.out.print(a+" ");};
		// cons.accept(40);
		// list.foreach
//		for(int i:list)
//		{
//			cons.accept(i);
//		}

		list.forEach((a) -> System.out.print(a + "  "));

		// sort AL

//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2);
//			}
//		});
//		System.out.println("\n ----Sorted List----");
//		list.forEach(no -> System.out.print(no + "  "));

		// System.out.println("\n Using Lambda Expression");

//		Collections.sort(list, (o1, o2) -> {
//			if (o1 < o2)
//				return -1;
//			else if (o1 > o2)
//				return 1;
//			else
//				return 0;
//
//		});
		// System.out.println("\n ----Sorted List----");
		// list.forEach(no -> System.out.print(no + " "));

		// java 8 List.sort()

		list.sort((o1,o2)->( (Integer)o1).compareTo(o2));


		System.out.println("\n ----Sorted List using Java 8 List.sort()----");
		list.forEach(no -> System.out.print(no + "  "));

	}

}
