package sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*
 * Display the string sorted as per reverse lexicographic order
 */
public class TestTreeSet2 {

	public static void main(String[] args) {
		// create empty TreeSet to store strings : for custom ordering
		// TreeSet(Comparator<T> comp)
		TreeSet<String> stringSet = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("In compare : rev order");
				return o2.compareTo(o1);
			}

		});
		//asc order : [eight, five, four, one, seven, six, three, two]
		// Use Collections API
		// public static boolean addAll(Collection<T> coll,T... elems)
		// Q : Use above method , to populate HS with one....five
		Collections.addAll(stringSet, "one", "two", "three", "four", "five", "six", "seven", "eight", "one", "three");
		// how to display HS ?
		System.out.println("TS contents using toString : " + stringSet);// no dups , un ordered ,sorted as per : String
																		// 's compareTo
		// desc order : [two, three, six, seven, one, four, five, eight]
	}

}



