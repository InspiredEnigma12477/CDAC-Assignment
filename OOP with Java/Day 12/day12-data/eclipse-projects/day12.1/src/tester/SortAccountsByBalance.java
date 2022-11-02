package tester;

import static utils.BankingUtils.populateBankAccounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.app.banking.BankAccount;

public class SortAccountsByBalance {

	public static void main(String[] args) {
		try {
			// get sample data
			Map<Integer, BankAccount> accounts = populateBankAccounts();
			System.out.println("All accounts ");
			for (BankAccount a : accounts.values())
				System.out.println(a);
			System.out.println("Sorted accts as per balance ");
			ArrayList<BankAccount> acctList = new ArrayList<>(accounts.values());

			Collections.sort(acctList, new Comparator<BankAccount>() {

				@Override
				public int compare(BankAccount o1, BankAccount o2) {
					System.out.println("in compare : balance");
					return ((Double) o1.getBalance()).compareTo(o2.getBalance());
				}

			});
			System.out.println("Bank accounts sorted as per bal");
			for (BankAccount a : acctList)
				System.out.println(a);

			System.out.println("All accounts ");
			for (BankAccount a : accounts.values())
				System.out.println(a);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
