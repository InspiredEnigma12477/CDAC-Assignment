package string_handling;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		String s1="Testing Strings is cool Strings !!!!!";
		System.out.println(s1.charAt(0)+" "+s1.charAt(s1.length()-1));
		System.out.println("Anish".compareTo("Anish"));// )
		String[] names= {"Anish","Riya","Rama","Rohan","Amiti","Kirti"};
		System.out.println(Arrays.toString(names));//ordered o/p
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));//sorted o/p
		System.out.println(s1.contains("is"));//true
		System.out.println(s1.indexOf("Strings")+" "+s1.lastIndexOf("Strings"));
		System.out.println(s1.substring(4, 10));//4 ---9th index
		String pattern="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*%]).{6,20}";
		System.out.println("abZ#1234".matches(pattern));//

	}

}
