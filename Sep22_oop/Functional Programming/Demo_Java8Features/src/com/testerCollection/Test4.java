package com.testerCollection;

import java.util.List;
import java.util.Map;

import com.app.banking.BankAccount;

import utils.BankUtils;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, BankAccount> accounts = BankUtils.populateAccountMap();
		// display all acts from map
		System.out.println("-----------------------------------------");
		accounts.forEach((k, v) -> System.out.println(k + "   " + v));
		System.out.println("----get Only Accounts From Map---------");

		List<BankAccount> acts = BankUtils.populateListFromMap(accounts);
		// show all BankAccount
		acts.forEach(a -> System.out.println(a));
		// here we are having all bank accout
		// operations on bank account
		// remove act
		// sort act
		System.out.println("----sort----------");

		acts.sort((a1, a2) -> ((BankAccount) a1).getCustomerName().compareTo(((BankAccount) a2).getCustomerName()));
		System.out.println("");

		acts.forEach(a -> System.out.println(a));

		// sort by balance,id,actType

		// remove

		System.out.println("-----Remove------------");
		acts.removeIf(p -> ((BankAccount) p).getAcctNo() == 101);
		System.out.println("");

		acts.forEach(a -> System.out.println(a));

	}

}
