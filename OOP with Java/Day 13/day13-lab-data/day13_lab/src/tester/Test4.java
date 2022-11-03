package tester;

import java.util.LinkedHashMap;
import static java.util.Map.*;

public class Test4 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(10, "ten");
		map.put(1, "one");
		map.put(5, "five");
		map.put(4, "four");
		map.put(7, "seven");
		System.out.println("LHM : ");
		System.out.println(map);
		// key set
		System.out.println("Keys ");
		for (int k : map.keySet())
			System.out.print(k + " ");
		System.out.println("\n Values ");
		for (String s : map.values())
			System.out.print(s + " ");
		System.out.println("Entries : ");
		for (Entry<Integer, String> entry : map.entrySet())
			System.out.println("Key " + entry.getKey() + " val " + entry.getValue());

	}

}
