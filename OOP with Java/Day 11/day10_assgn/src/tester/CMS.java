package tester;

import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import static utils.CMSUtils.*;
import static utils.ValidationRules.*;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			// get a populated AL<Customer> from CMSUtils
			List<Customer> customerList = populateCustomerDetails();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 0. Exit  1. Customer registration 2. Display Details "
						+ "3. Customer login 4. Change Password");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter customer details for signup :  name,  email,  pwd, regAmount,  dob  plan");
						Customer cust = validateCustomerDetails(sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), customerList);
						customerList.add(cust);
						System.out.println("Customer reg done !");
						break;
					case 2: // display customer details
						System.out.println("Customer details");
						for (Customer c : customerList)
							System.out.println(c);
						break;

					case 3:
						System.out.println("Enter email n password for sign in");
						cust = customerLogin(sc.next(), sc.next(), customerList);
						System.out.println("Successful Login , Your details : " + cust);
						break;
					case 4:
						System.out.println("Enter email n password for sign in");
						cust = customerLogin(sc.next(), sc.next(), customerList);
						System.out.println("Login success , Enter new password");
						cust.setPassword(validatePassword(sc.next()));
						System.out.println("password changed!");
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
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
