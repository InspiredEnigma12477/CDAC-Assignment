package tester;

import static utils.BankingUtils.*;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.banking.AcctType;
import com.app.banking.BankAccount;

public class SortAccountsByAcctNoDesc {

	public static void main(String[] args) {
		try {
			// get sample data
			Map<Integer, BankAccount> accounts = populateBankAccounts();
			System.out.println("All accounts ");
			for (BankAccount a : accounts.values())
				System.out.println(a);
			System.out.println("Sorted accts as per desc acct no ");
			TreeMap<Integer, BankAccount> sortedMap = new TreeMap<>(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					System.out.println("in compare");
					return o2.compareTo(o1);
				}
				
			});
			//copy all entries from hm --> tm
			sortedMap.putAll(accounts);
			// in above stmt : JVM will invoke : SortAccountsByAcctNoDesc$1 's compare
			System.out.println("Sorted accts as per desc acct no");
			
			// display treemap
			for (BankAccount a : sortedMap.values())
				System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
