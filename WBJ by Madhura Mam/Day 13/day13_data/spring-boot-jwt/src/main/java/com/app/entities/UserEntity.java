package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class UserEntity extends BaseEntity {
	@NotBlank(message = "First name can't be blank")
	@Length(min = 4, max = 20, message = "Invalid first name!!!!!!")
	@Column(name = "first_name", length = 20)
	private String firstName;
	@NotBlank(message = "Last  name can't be blank")
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Column(length = 20, unique = true)
	@Email(message = "Invalid email format")
	private String email;
	@Column(length = 300)
	@JsonProperty(access = Access.WRITE_ONLY) // skipped during ser(=marshalling) n kept during de-ser (un marshalling)
//	@Pattern(regexp ="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})",message = "Invalid Password !")
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	@NotNull(message = "Role must be supplied")
	private Role role;
	
	

}
