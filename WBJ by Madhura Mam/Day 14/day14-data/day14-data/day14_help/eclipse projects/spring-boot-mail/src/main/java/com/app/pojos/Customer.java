package com.app.pojos;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

//id | name    | email          | password | reg_amt | reg_date   | role  
@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;	
	@NotBlank
	@Length(min = 5, max = 15)
	private String email;	
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[$#@%]).{5,10})")
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private double regAmt;
	private LocalDate regDate;
	private String role;
}