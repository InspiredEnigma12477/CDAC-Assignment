package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {

	@NotBlank(message = "first name is required")
	private String name;

	@NotBlank(message = "last name is required")
	@Length(min = 4, max = 20, message = "Invalid length of last name")
	private String lastName;

	@NotBlank(message = "email is required")
	@Email(message = "invalid email format")
	private String email;

	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})", message = "Blank or Invalid password")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;//will be used in un-marshalling (Jackson DOES invoke setters during ser/marshalling)

	@NotBlank(message = "location must be supplied")
	private String location;

	@JsonProperty(value = "department")
	private String dept;
	@NotNull(message = "Salary must be supplied")
	@Range(min = 10000, max = 500000, message = "Salary outside the range")
	private double salary;
	@Future(message = "join date must be in future")
	private LocalDate joinDate;
	// additional property to store path of the image , stored on server side folder
	// : imagePath : String
	// replace it by byte[] image : in case u want to store it on DB
	@JsonProperty(access = Access.READ_ONLY)
	private String imagePath;//will not appear in the request
	////will be used in marshalling (Jackson DOES invoke getters  during de ser/un marshalling)
	//request : NO
	//resp : NO : jsonignore OR simply don't add the property in DTO
	//request : NO
		//resp : YES  => marshalling ---> getters 
	

}
