package com.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BankAcctDTO {
	private Integer id;
	private AcctType acctType;
	private double balance;
	

}
