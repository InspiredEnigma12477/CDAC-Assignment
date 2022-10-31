package tester;

import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			// get a populated AL<Customer> from CMSUtils
			List<Customer> customerList = populateCustomerDetails();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options ");
				try {
					switch (sc.nextInt()) {
					case 1:

						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}
		} // JVM : sc.close()

	}

}
