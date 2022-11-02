package utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.app.banking.AcctType;
import com.app.banking.BankAccount;

import custom_exceptions.BankingException;
import static com.app.banking.AcctType.*;

public class BankingUtils {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

	// add a static method for min bal validation
	public static double validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Insufficient Balance !!!!");
		return balance;
	}

	// add a static method to populate map with sample data
	public static Map<Integer, BankAccount> populateBankAccounts() throws BankingException {
		Map<Integer, BankAccount> accts = new HashMap<>();
		// String customerName, double balance, AcctType acType, LocalDate creationDate)
		// {
		System.out.println(accts.put(101,
				new BankAccount(101, "Rama", validateBalance(10000), SAVINGS, LocalDate.parse("2020-01-01"))));
		System.out.println(accts.put(10,
				new BankAccount(10, "Rama", validateBalance(6000), CURRENT, LocalDate.parse("2020-11-01"))));

		System.out.println(accts.put(15,
				new BankAccount(15, "Shubham", validateBalance(100000), FD, LocalDate.parse("2020-05-21"))));

		System.out.println(accts.put(60,
				new BankAccount(60, "Riya", validateBalance(60000), SAVINGS, LocalDate.parse("2020-11-11"))));

		System.out.println(accts.put(101,
				new BankAccount(101, "Tejas", validateBalance(10000), SAVINGS, LocalDate.parse("2020-01-01"))));
		return accts;
	}
}
