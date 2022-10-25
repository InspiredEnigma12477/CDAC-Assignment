package iacsd.tester;

import iacsd.bank.Account;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account.showCount();
		
		Account act1=new Account(101, "Ram", "pune", "r@gmail.com", 50000);
		act1.showAccount();//101, "Ram", "pune", "r@gmail.com", 50000  count:1
		
		Account act2=new Account(999, "Sham", "Pune", "s@gmail.com", 20000);
		act2.showAccount();//999, "Sham", "Pune", "s@gmail.com", 20000 count:2
		
		Account.showCount();
		
		
		for(int i=1;i<=10;i++)
		{int x=1;
			Account act=new Account();
			System.out.println(act.hashCode());
			act.showAccount();
			System.out.print(x+"    ");//10
			x++;
		}
		
		Account.showCount();
		
		
	}

}
