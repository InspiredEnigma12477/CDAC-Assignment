package tester;

import static utils.BankingUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.app.banking.AcctType;
import com.app.banking.BankAccount;

public class DisplayAcctNameByAcctType {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get sample data
			Map<Integer, BankAccount> accounts = populateBankAccounts();
			System.out.println("All accounts ");
			for (BankAccount a : accounts.values())
				System.out.println(a);
			System.out.println("Enter acct type");
			AcctType acctType = validateAcctType(sc.next());
			// search criterial : value based --convert map ---> collection
			System.out.println("Customer names having Account of the type : " + acctType);
			for (BankAccount a : accounts.values())
				if (a.getAcType() == acctType)
					System.out.println(a.getCustomerName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
