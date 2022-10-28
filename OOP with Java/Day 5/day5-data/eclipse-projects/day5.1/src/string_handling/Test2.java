package string_handling;

// testing == vs equals : IMPORTANT
public class Test2 {

	public static void main(String[] args) {
		String s1 = new String("Hi There");
		String s2 = new String("Hi There");
		System.out.println(s1 == s2);// ref equality : false
		System.out.println(s1.equals(s2));// content equality : true
		String s3 = s1.toUpperCase();
		System.out.println(s1.equals(s3));// f
		System.out.println(s1.equalsIgnoreCase(s3));// t
		// String class has overridden , equals method , inhierited from OBject class ,
		// to replace ref equality by content(char seq.) equality

	}

}
