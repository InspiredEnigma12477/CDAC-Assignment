package tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.banking.AcctType;
import com.app.banking.BankAccount;

import custom_exceptions.BankingException;

import static utils.BankingUtils.*;

public class Bank {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// set up , init phase of the app
			// get the populated map of accts
			Map<Integer, BankAccount> accounts = populateBankAccounts();
//			System.out.println("Map contents via toString ");
//			System.out.println(accounts);
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Create A/C 2. Display all accts 3. Fetch A/C Summary "
						+ "4. Transfer Funds 5. Close A/c 100.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter acct  acctNo ");
						int acctNo = sc.nextInt();
						if (!accounts.containsKey(acctNo)) // int --> Integer --> Object
						{
							System.out.println("Enter other details : customerName,  balance,  acType,  creationDate ");
							accounts.put(acctNo, new BankAccount(acctNo, sc.next(), validateBalance(sc.nextDouble()),
									AcctType.valueOf(sc.next().toUpperCase()), LocalDate.parse(sc.next())));
						} else
							throw new BankingException("Dup Acct No !!!!!!!!!!!!");

						break;

					case 2:
						System.out.println("All Bank Accounts");
						for (BankAccount a : accounts.values())
							System.out.println(a);
						break;
					case 3:
						System.out.println("Enter acct no");
						acctNo = sc.nextInt();
						BankAccount acct = accounts.get(acctNo);// int --> Integer --> Object
						if (acct == null)
							throw new BankingException("Invalid A/C No !!!!!!!!");
						System.out.println("A/C Details " + acct);
						break;

					case 4:
						System.out.println("Enter src acct no , dest acct no n transfer amount");
						BankAccount src = accounts.get(sc.nextInt());
						if (src == null)
							throw new BankingException("Invalid Src A/C No !!!!!!!!");
						// => src a/c exists
						BankAccount dest = accounts.get(sc.nextInt());
						if (dest == null)
							throw new BankingException("Invalid Dest A/C No !!!!!!!!");
						// => dest a/c exists
						src.transferFunds(sc.nextDouble(), dest);
						System.out.println("Funds transferred....");
						break;
					case 5:
						System.out.println("Enter  acct no for closing");
						acct = accounts.remove(sc.nextInt());
						if(acct == null)
							throw new BankingException("Invalid a/c no , can't close the a/c");
						System.out.println("Closed A/C "+acct);
						break;
					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
