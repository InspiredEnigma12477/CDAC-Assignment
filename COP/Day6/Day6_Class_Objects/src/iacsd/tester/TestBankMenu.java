package iacsd.tester;

import java.util.Scanner;

import iacsd.axisbank.BankAccount;

public class TestBankMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int value;// final variable is constant
		value = 90;

		// value=50;//error
		BankAccount a = new BankAccount();// ref var
		System.out.println(a.hashCode());
		final BankAccount b = new BankAccount();

		System.out.println(b.hashCode());

		// b=a;

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		System.out.println("1:Create Account  2:Show All  3:search account "
				+ " 4:edit/update/modify name 5:get Balance for account 6:exit"
				+ "7:deposite 8: withdraw 9:money tranfser");

		// create array of class BankAccount

		BankAccount[] bank = new BankAccount[20];// from index 0 to 9 values null
		Scanner sc = new Scanner(System.in);
		int ch;
		int index = 0;
		do {
			System.out.println("Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:// create new BankAccount add in array
				if (index < bank.length) {
					System.out.println("Enter name address email balance");
					BankAccount act = new BankAccount(sc.next(), sc.next(), sc.next(), sc.nextDouble());
					bank[index] = act;// index=0
					index++;
				} else
					System.out.println("Array Is Full");
				break;
			case 2:
				System.out.println("---show all accounts------");
//				for (int i = 0; i < bank.length; i++) {
//					if(bank[i]!=null)
//					bank[i].showAccount();
//				}
				// or

//				for(BankAccount b:bank)
//				{
//					if(b!=null)
//						b.showAccount();
//				}

				for (int i = 0; i < index; i++) {
					bank[i].showAccount();
				}

				break;
			case 3:
				System.out.println("Enter AccountId:");
				int actid = sc.nextInt();

				for (int i = 0; i < index; i++) {
					if (bank[i].getActid() == actid)
						bank[i].showAccount();

				}

				break;
			case 4:

				System.out.println("Enter AccountId:");
				int ia = sc.nextInt();

				for (int i = 0; i < index; i++) {
					if (bank[i].getActid() == ia) {
						System.out.println("Enter New Name");
						String str = sc.next();//
						bank[i].setName(str);
						System.out.println("Name is Updated");
						bank[i].showAccount();
					}

				}

				break;
			case 5:
				break;
			case 7:

				System.out.println("Enter AccountId:");
				int id = sc.nextInt();

				for (int i = 0; i < index; i++) {
					if (bank[i].getActid() == id) {
						System.out.println("Enter Amount");
						double amount = sc.nextDouble();//
						bank[i].deposite(amount);
						bank[i].showAccount();
					}

				}

				break;
			default:
				break;

			}// switch
		} while (ch != 6);// do while
		System.out.println("----------Thank You-----");
	}

}
