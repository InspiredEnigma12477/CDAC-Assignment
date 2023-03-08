package com.app.service;

import com.app.dto.BankAcctDTO;

public interface NetBankingClntService {
	BankAcctDTO getAccountDetails(long empId,int acctNo);
}
