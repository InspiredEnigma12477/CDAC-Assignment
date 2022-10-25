package exc_handling;

import java.util.Scanner;

public class Test5 {
//Testing try-with-resources syntax
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Enter parsable integer");
			String number = sc.next();
			int num = Integer.parseInt(number);
			System.out.println(num);
			System.out.println("End of try....");
		} // JVM impl calls : sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main cntd....");

	}

}
