package generics;

import java.util.List;
import java.util.Set;

import static generics.GenUtils.*;

public class Test1 {

	public static void main(String[] args) {
		// print elems from List<Integer>
		List<Integer> l1 = List.of(10, 20, 30, 40, 50);// auto boxing
		printDetails(l1);
		System.out.println("-----------------------------");
		printDetails2(l1);
	//	l1.set(0, 9999);// will it work ? NO : un supported opeartion exc : since the list is un
						// modifiable !
	//	l1.add(12345);// will it work ? NO : un supported opeartion exc : since the list is un
						// modifiable !
		// Set : Double 1.8.,2.3 ....
		Set<Double> doubleSet = Set.of(1.0, 2.4, 3.56, 4.67, 5d);
		printDetails(doubleSet);
		System.out.println("-----------------------------");
		printDetails2(doubleSet);

	}

}
