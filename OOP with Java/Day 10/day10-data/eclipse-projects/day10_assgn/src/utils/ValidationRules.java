package utils;

import static com.app.core.Customer.sdf;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.app.core.Customer;

import custom_exceptions.CustomerHandlingException;

public class ValidationRules {
	// add static date
	public static Date checkDate;
	static {
		try {
			checkDate=sdf.parse("1/1/1995");
		} catch (ParseException e) {
			System.out.println("err in static init block "+e);
		}
	}

//add a static method for email validation
	public static String validateEmail(String email) throws CustomerHandlingException {
		String pattern = "^[\\w\\.-]+@[\\w\\.-]+(com|org|net)$";
		if (email.matches(pattern))
			return email;
		throw new CustomerHandlingException("Invalid Email !!!!!!!!!!!!!");
	}

	// add a static method for pwd validation
	public static String validatePassword(String pwd) throws CustomerHandlingException {
		String pattern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*%]).{5,10}";
		if (pwd.matches(pattern))
			return pwd;
		throw new CustomerHandlingException("Invalid Password!!!!!");
	}

	// add a static method to parse n validate date
	public static Date parseAndValidateDob(String dob) throws ParseException,CustomerHandlingException {
		Date dobDate = sdf.parse(dob);
		if(dobDate.before(checkDate))
			return dobDate;
		throw new CustomerHandlingException("Invalid DoB!!!!!!!!!!!!");

	}
	// add a static method to check if email id is dup
	public static String checkForDup(String email,List<Customer> custList) throws CustomerHandlingException
	{
		//em : abc101@gmail.com
		//1. create customer instance to wrap PK(email)
		Customer c=new Customer(email);
		//{c1(abc1@gmail.com),c2,.....c100}
		if(custList.contains(c)) //contains internally invokes Customer's equals method 
			throw new CustomerHandlingException("Dup email !!!!!!!!!!!!!!");
		return email;
	}

}




