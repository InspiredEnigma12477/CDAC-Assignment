package tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.banking.BankAccount;
import static utils.BankingUtils.validateAcctType;
import static utils.IOUtils.readAcctDetails;

public class TestStoreBankAccount {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String fileName = sc.nextLine();
			BankAccount acctDetails = readAcctDetails(fileName);
			System.out.println("re-stored acct details "+acctDetails);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
