package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.EmployeeRepository;
import com.app.dto.BankAcctDTO;
import com.app.entities.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class NetBankingClntServiceImpl implements NetBankingClntService {
	// dep : Emp repo
	@Autowired
	private EmployeeRepository empRepo;
	// dep : RestTemplate : to be built in spring boot env using it's builder
	private RestTemplate restTemplate;
	//dep : REST server url
	@Value("${netbanking.get.url}")
	private String getUrl;

	// auto wiring of rest template builder : using ctro based D.I
	@Autowired // autowire=constructor
	public NetBankingClntServiceImpl(RestTemplateBuilder builder) {
		restTemplate = builder.build();
	}

	@Override
	public BankAcctDTO getAccountDetails(long empId, int acctNo) {
		// validate emp id
		Employee employee = empRepo.findById(empId)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Emp ID , can't access acct details "));
		// => emp id valid ---> proceed to making a call to another REST API (NetBanking
		// server ) using an abstraction : RestTemplate
		// API of RestTemplate for getting a resource
		/*
		 * public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType,
		 * Object... uriVariables) throws RestClientException
		 */
		//make a REST call to the back end (net banking server)
		log.info("service : acctno {} ", acctNo);
		ResponseEntity<BankAcctDTO> respEntity = restTemplate.getForEntity(getUrl, BankAcctDTO.class, acctNo);
		return respEntity.getBody();
	}

}
