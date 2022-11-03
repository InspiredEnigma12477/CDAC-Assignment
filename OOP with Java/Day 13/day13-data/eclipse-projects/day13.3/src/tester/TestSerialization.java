package tester;

import java.util.Scanner;
import static utils.SerDeSerUtils.writeAcctsData;
import static utils.BankingUtils.populateBankAccounts;

public class TestSerialization {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name");
			writeAcctsData(sc.nextLine(),populateBankAccounts());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
		

	}

}
