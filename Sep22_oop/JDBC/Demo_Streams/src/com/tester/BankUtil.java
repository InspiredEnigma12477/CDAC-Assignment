package com.tester;

import java.util.ArrayList;
import java.util.List;

public class BankUtil {

	public static  List<BankAccount> getAllAccounts()
	{
	List<BankAccount> acts=new ArrayList<BankAccount>();
	acts.add(new BankAccount(10, "Vaishali", "Pune", 90000));
	acts.add(new BankAccount(310, "Chetan", "Mumbai", 60000));
	
	acts.add(new BankAccount(410, "Rahul", "Thane", 30000));
	
	acts.add(new BankAccount(165, "Nisha", "Mumbai", 89000));
	
	acts.add(new BankAccount(490, "Manisha", "Nashik", 56000));
	acts.add(new BankAccount(1, "Zen", "Xyz", 90000));
	
		return acts;
	}
}
