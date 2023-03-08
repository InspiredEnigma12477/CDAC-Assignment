package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bank_customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
	@NotBlank(message = "Customer ID is required")
	@Id //constraint : PK  , BUT not using auto id generation via @GeneratedValue(...)
	@Column(length = 20)
	private String customerId;

	@NotBlank(message = "Name is required")
	@Length(min = 3, max = 15, message = "Invalid len of Name")
	@Column(length = 20)
	private String name;

	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})", message = "Blank or Invalid password")
	@Column(length = 20, nullable = false)
	private String password;

}
