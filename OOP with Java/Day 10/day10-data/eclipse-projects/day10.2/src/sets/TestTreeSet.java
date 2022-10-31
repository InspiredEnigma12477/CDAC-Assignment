package sets;

import java.util.Collections;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// create empty TreeSet to store strings
		TreeSet<String> stringSet = new TreeSet<>();
		// Use Collections API
		// public static boolean addAll(Collection<T> coll,T... elems)
		// Q : Use above method , to populate HS with one....five
		Collections.addAll(stringSet, "one", "two", "three", "four", "five", "six", "seven", "eight", "one", "three");
		// how to display HS ?
		System.out.println("TS contents using toString : " + stringSet);// no dups , un ordered ,sorted as per : String
																		// 's compareTo
	}

}
