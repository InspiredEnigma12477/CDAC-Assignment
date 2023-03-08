package com.testerCollection;

import java.util.HashMap;
import java.util.Map;

import com.app.banking.BankAccount;

import utils.BankUtils;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, BankAccount> accounts=BankUtils.populateAccountMap();
		//display all acts from map
		System.out.println("-----------------------------------------");
		accounts.forEach((k,v)->System.out.println(k+"   "+v));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
