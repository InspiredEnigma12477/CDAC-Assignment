package com.app.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardDto {
	private String cardNo;
	private String customerName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate expiryDate;
	private String cvv;
	private double amount;
}
