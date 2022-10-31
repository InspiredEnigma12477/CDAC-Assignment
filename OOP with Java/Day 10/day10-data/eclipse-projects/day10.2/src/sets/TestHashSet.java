package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// create empty HashSet to store strings
		HashSet<String> stringSet = new HashSet<>();
		// Use Collections API
		// public static boolean addAll(Collection<T> coll,T... elems)
		// Q : Use above method , to populate HS with one....five
		Collections.addAll(stringSet, "one", "two", "three", "four", "five", "six", "seven", "eight", "one", "three");
		// how to display HS ?
		System.out.println("HS contents using toString : " + stringSet);// no dups , un ordered , un sorted
		System.out.println("size " + stringSet.size());
		System.out.println("Display the set using itr");
		Iterator<String> stringItr = stringSet.iterator();
		System.out.println("imple cls for itr " + stringItr.getClass());// HashSet$Itr : see if it's correct ?????
		while (stringItr.hasNext())
			System.out.print(stringItr.next() + " ");
		System.out.println(stringSet.contains("five"));//true
		System.out.println(stringSet.remove("five"));//t
		System.out.println(stringSet.contains("five"));//f
		stringSet.add("zero");//appends zero
		System.out.println(stringSet);//un ordered n un sorted

	}

}






