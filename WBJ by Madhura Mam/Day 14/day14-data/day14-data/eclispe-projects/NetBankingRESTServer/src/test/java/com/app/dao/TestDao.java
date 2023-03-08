package com.app.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.app.dto.AcctType;
import com.app.entities.BankAccount;
import com.app.entities.Customer;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class TestDao {
	@Autowired 
	private CustomerRepository custRepo;
	
	@Autowired
	private BankAccountRepository acctRepo;

	@Test
	void testAddCustomer() {
		Customer c1=new Customer("hdfc-1001","Rama","ram#123");
		Customer customer = custRepo.save(c1);
		assertEquals("hdfc-1001", customer.getCustomerId());
		Customer c2=new Customer("hdfc-1002","Kiran","kir#123");
		Customer customer2 = custRepo.save(c2);
		assertEquals("hdfc-1002", customer2.getCustomerId());
	}
	@Test
	void testAddAccountToCustomer() {
		Customer c=custRepo.findById("hdfc-1001").get();
		BankAccount a1=new BankAccount(AcctType.SAVING, 10000);
		BankAccount a2=new BankAccount(AcctType.CURRENT, 5000);
		a1.setAcctOwner(c);
		a2.setAcctOwner(c);
		acctRepo.save(a1);
		acctRepo.save(a2);		
	}

}
