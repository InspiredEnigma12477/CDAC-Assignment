package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import static utils.ValidationRules.*;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custom_exceptions.CustomerHandlingException;

public class CMSUtils {
	public static List<Customer> populateCustomerDetails() throws ParseException, CustomerHandlingException {
		List<Customer> list = new ArrayList<>();
		list.add(validateCustomerDetails("Rama", "rama@gmail.com", "abcD#123", 5000, "1/2/1994", "gold", list));
		list.add(validateCustomerDetails("Chetan", "chetan@gmail.com", "defD#23", 4000, "1/12/1992", "silver", list));
		list.add(validateCustomerDetails("Riya", "rama@gmail.com", "xyzB@123", 6000, "10/5/1994", "diamond", list));
		return list;
	}

	// add a static method for customer login
	public static Customer customerLogin(String email, String pwd, List<Customer> list)
			throws CustomerHandlingException {
		validateEmail(email);
		validatePassword(pwd);
		// => email n password are valid , find the customer by PK (email)
		Customer c = findByEmail(email, list);
		// => email is found now chk pwd
		if (c.getPassword().equals(pwd))
			return c;
		throw new CustomerHandlingException("Invalid Login : wrong password!!!!");
	}
}
