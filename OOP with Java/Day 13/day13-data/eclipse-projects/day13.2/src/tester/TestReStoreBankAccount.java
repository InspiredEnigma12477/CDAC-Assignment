package tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.banking.BankAccount;
import static utils.BankingUtils.validateAcctType;
import static utils.IOUtils.writeAcctDetails;

public class TestReStoreBankAccount {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String fileName = sc.nextLine();
			System.out.println("Enter acct details");
			BankAccount a = new BankAccount(sc.nextInt(), sc.next(), sc.nextDouble(), validateAcctType(sc.next()),
					LocalDate.parse(sc.next()));
			writeAcctDetails(fileName, a);
			System.out.println("stored acct details !");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
