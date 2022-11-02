package tester;

import static utils.BankingUtils.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.banking.AcctType;
import com.app.banking.BankAccount;

public class DisplayAcctsByDate {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get sample data
			Map<Integer, BankAccount> accounts = populateBankAccounts();
			System.out.println("All accounts ");
			for (BankAccount a : accounts.values())
				System.out.println(a);
			System.out.println("Enter start n end date(yr-mon-day)");
			LocalDate strt=LocalDate.parse(sc.next());
			LocalDate end=LocalDate.parse(sc.next());
			for(BankAccount a : accounts.values())
				if(a.getCreationDate().isAfter(strt) && a.getCreationDate().isBefore(end))
					System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
