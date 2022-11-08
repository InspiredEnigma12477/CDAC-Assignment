package tester;

import java.util.Map;
import java.util.Scanner;

import com.app.banking.BankAccount;

import runnable_tasks.AcctDateSorter;
import runnable_tasks.AcctTypeSorter;

import static utils.BankingUtils.populateBankAccounts;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name to store sorted accts as per date");
			String fileName1=sc.nextLine();
			System.out.println("Enter file name to store sorted accts as per type");
			String fileName2=sc.nextLine();
			//get populated map from Banking Utils
			Map<Integer, BankAccount> map = populateBankAccounts();
			//create task --attach a thrd n start it
			Thread t1=new Thread(new AcctDateSorter(map, fileName1), "date_sorter");
			Thread t2=new Thread(new AcctTypeSorter(map, fileName2), "type_sorter");
			t1.start();
			t2.start();
			System.out.println("waiting for child thrds to complete");
			t1.join();
			t2.join();
			System.out.println("main over.....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
