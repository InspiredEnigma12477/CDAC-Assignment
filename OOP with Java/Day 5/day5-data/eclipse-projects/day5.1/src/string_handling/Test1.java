package string_handling;
//immutability of the String objects
public class Test1 {

	public static void main(String[] args) {
		String s1=new String("hello");
		 String s2=s1.toUpperCase();
		System.out.println(s1);//lower cased
		System.out.println(s2);//upper cased
		s1.concat("12345");
		System.out.println(s1);//hello
		s2=s1.replace('l','t');
		System.out.println(s1);
		System.out.println(s2);

	}

}
