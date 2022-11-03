package generics;

import java.util.List;
import java.util.Set;

import static generics.GenUtils.*;

public class Test2 {

	public static void main(String[] args) {
		// print elems from List<Integer>
		List<Integer> l1 = List.of(10, 20, 30, 40, 50);// auto boxing
		// Set : Double 1.8.,2.3 ....
		Set<Double> doubleSet = Set.of(1.0, 2.4, 3.56, 4.67, 5d);
		System.out.println("sum "+ findSqRtOfSum(l1));
		System.out.println("sum "+ findSqRtOfSum(doubleSet));
		
		

	}

}
