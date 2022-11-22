import java.util.HashMap;
import java.util.Map;

public class CharCount {
	// take a string as input ( with spaces)
	// print count of every unique character in a string
	// Ex. "Hello World" --> H-> 1, e-> 1 , l -> 3 ..etc
	public static void charCount(String s) {
		
		HashMap<Character, Integer> count = new HashMap<>();
		for (char c : s.toCharArray()) {
			if(count.containsKey(c) == true) {
				int currCount = count.get(c);
				count.put(c, currCount+1);
			}
			else {
				count.put(c, 1);
			}
		}
		for(Map.Entry e: count.entrySet()) {
			System.out.println(e.getKey() +" " + e.getValue());
		}
		
	}
	
	public static void main(String [] args) {
		charCount("Hello");
		//HashMap<Character, Character> map;  {} [] () <>
	}
}
