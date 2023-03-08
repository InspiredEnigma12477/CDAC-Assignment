package com.app.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateAccountRequest {
	@NotEmpty(message = "customer id must be supplied")
	private String custId;
	@NotNull(message = "account type must be supplied")
	private AcctType type;
	@Min(value =5000,message = "min balance must be > 5000")
	private double balance;
}
