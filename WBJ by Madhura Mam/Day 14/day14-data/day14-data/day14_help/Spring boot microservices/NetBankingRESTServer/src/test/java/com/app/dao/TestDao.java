//package com.app.dao;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.app.pojos.AcctType;
//import com.app.pojos.BankAccount;
//import com.app.pojos.Customer;
//
//@SpringBootTest
//class TestDao {
//	@Autowired 
//	private CustomerRepository custRepo;
//	
//	@Autowired
//	private BankAccountRepository acctRepo;
//
////	@Test
////	void testAddCustomer() {
////		Customer c1=new Customer("hdfc-1001","Rama","ram#123");
////		Customer customer = custRepo.save(c1);
////		assertEquals("hdfc-1001", customer.getCustomerId());
////		Customer c2=new Customer("hdfc-1002","Kiran","kir#123");
////		Customer customer2 = custRepo.save(c2);
////		assertEquals("hdfc-1002", customer2.getCustomerId());
////	}
////	@Test
////	void testAddAccountToCustomer() {
////		Customer c=custRepo.findById("hdfc-1001").get();
////		BankAccount a1=new BankAccount(AcctType.SAVING, 10000);
////		BankAccount a2=new BankAccount(AcctType.CURRENT, 5000);
////		a1.setAcctOwner(c);
////		a2.setAcctOwner(c);
////		acctRepo.save(a1);
////		acctRepo.save(a2);
////		
////		
////	}
//
//}
