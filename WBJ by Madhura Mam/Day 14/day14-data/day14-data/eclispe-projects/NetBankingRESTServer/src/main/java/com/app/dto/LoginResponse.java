package com.app.dto;

import java.util.List;

import com.app.entities.BankAccount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class LoginResponse {
	private String customerName;
	private List<BankAccount> accounts;

}
