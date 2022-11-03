package generics;

import static generics.GenUtils.addMango;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import fruits.Alphonso;
import fruits.Mango;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * AL<Mango> Vector<Fruit> LL<Object> HS<Fruit> LL<Alphonso> AL<Orange> 1, 2 ,3
		 */
		ArrayList<Mango> mangoes = new ArrayList<>();
		addMango(mangoes, new Mango());
		LinkedList<Alphonso> alphonsoes = new LinkedList<>();
		// addMango(alphonsoes, new Mango());

//		Collection<?> coll=new HashSet<String>();
//		coll.add("dfgsdf");

	}
	/*
	 * 1.5 Write a method to find n ret max number from ANY list(AL/LL/Vector) of
	 * any type of numbers (byte/short/int/long....)
	 */
	

}
