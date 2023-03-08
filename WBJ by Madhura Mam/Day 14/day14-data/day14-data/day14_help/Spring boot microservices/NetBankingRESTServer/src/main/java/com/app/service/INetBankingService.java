package com.app.service;

import javax.validation.Valid;

import com.app.dto.BankAcctDTO;
import com.app.dto.CreateAccountRequest;
import com.app.dto.LoginResponse;
import com.app.entities.BankAccount;

public interface INetBankingService {
	LoginResponse authenticateCustomer(String customerId, String pwd);

	BankAccount createNewAccount(CreateAccountRequest request);

	BankAcctDTO getBankAccountDetails(int acctNo);
}
