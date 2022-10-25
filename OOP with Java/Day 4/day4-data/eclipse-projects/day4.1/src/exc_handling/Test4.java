package exc_handling;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=null;
		try {
			 sc= new Scanner(System.in);
			System.out.println("Enter parsable integer");
			String number = sc.next();
			int num = Integer.parseInt(number);
			System.out.println(num);
			System.out.println("End of try....");
		} finally {
			System.out.println("closing the scanner");
			sc.close();
		}

	}

}
