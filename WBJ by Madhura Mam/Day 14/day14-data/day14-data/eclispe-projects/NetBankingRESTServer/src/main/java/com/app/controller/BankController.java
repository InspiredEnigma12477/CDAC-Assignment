package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.BankAcctDTO;
import com.app.dto.CreateAccountRequest;
import com.app.dto.LoginRequest;
import com.app.service.INetBankingService;

//@CrossOrigin(origins ="http://localhost:3000")
@RestController // @Controller at the class level + @ResponseBody : on ret types of all req
				// handling methods
@RequestMapping("/bank")
public class BankController {
	@Autowired
	private INetBankingService service;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateCustomer(@RequestBody LoginRequest request) {
		System.out.println("in auth cust " + request);
		return ResponseEntity.ok(service.authenticateCustomer(request.getCustomerId(), request.getPassword()));
	}

	// add REST endpoint to create new bank account
	@PostMapping("/account")
	public ResponseEntity<?> createBankAccount(@RequestBody @Valid CreateAccountRequest request) {
		System.out.println("in cr a/c " + request);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createNewAccount(request));
	}

	// add REST end point API to get account details : /bank/accounts/{acctNo}
	@GetMapping("/accounts/{acctNo}")
	public ResponseEntity<?> getAccountDetails(@PathVariable int acctNo) {
		System.out.println("in get acct : rest server "+acctNo);
		return ResponseEntity.ok(service.getBankAccountDetails(acctNo));
	}

}
