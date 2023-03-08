package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Getter
@Setter
public class Employee extends BaseEntity {
	@Column(length = 20)

	private String name;
	@Column(length = 20, unique = true)

	private String lastName;
	@Column(length = 20)

	private String email;
	@Column(length = 20)
	private String password;
	@Column(length = 20)
	private String location;
	@Column(length = 20, name = "dept_name")
	private String dept;
	private double salary;
	private LocalDate joinDate;
	// additional property to store path of the image , stored on server side folder
	// : imagePath : String
	// replace it by byte[] image : in case u want to store it on DB
	@Column(length = 400)
	private String imagePath;

}
