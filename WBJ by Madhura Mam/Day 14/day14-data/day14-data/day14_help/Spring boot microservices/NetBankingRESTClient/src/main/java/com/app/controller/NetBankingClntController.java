package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.NetBankingClntService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/emps/{empId}/accts")
@CrossOrigin(origins = "http://localhost:3000")
@Slf4j
public class NetBankingClntController {
	//dep 
	@Autowired
	private NetBankingClntService netBankingClntService;
	public NetBankingClntController() {
		log.info("in ctor of {} ", getClass());
	}
	//add REST end point to access emp's acct details
	@GetMapping("/{acctNo}")
	public ResponseEntity<?> getEmpAccountDetails(@PathVariable long empId,@PathVariable int acctNo)
	{
		log.info("rest clnt : get acct no {} ",acctNo);
		return ResponseEntity.ok(netBankingClntService.getAccountDetails(empId,acctNo));
	}
}
