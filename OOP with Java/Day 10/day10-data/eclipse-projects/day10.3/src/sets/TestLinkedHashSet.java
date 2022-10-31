package sets;

import java.util.Collections;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// create empty LinkedHashSet to store strings
		LinkedHashSet<String> stringSet = new LinkedHashSet<>();
		// Use Collections API
		// public static boolean addAll(Collection<T> coll,T... elems)
		// Q : Use above method , to populate HS with one....five
		Collections.addAll(stringSet, "one", "two", "three", "four", "five", "six", "seven", "eight", "one", "three");
		// how to display HS ?
		System.out.println("LHS contents using toString : " + stringSet);// no dups , ordered , un sorted
		}

}






