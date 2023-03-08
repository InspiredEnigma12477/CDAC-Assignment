package com.app.pojos;
/*
 *  <tr key={employee.id}>
                <td>{employee.firstName}</td>
                <td>{employee.lastName}</td>
                <td>{employee.email}</td>
                <td>{employee.workLocation}</td>
                <td>{employee.department}</td>
                <td>{employee.joinDate}</td>
                <td>{employee.salary}</td>
         
 */

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//JPA annotations
@Entity
@Table(name="new_emps")
//lombok annotations
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true,exclude = "password")
public class Employee extends BaseEntity{
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column(length = 30,unique = true)
	private String email;
	@Column(length = 20,nullable = false)
	private String password;
	@Column(length = 20)
	@JsonProperty(value = "location")
	private String workLocation;
	@Column(length = 20)
	private String department;
	private LocalDate joinDate;
	private double salary;
	public Employee(String firstName, String lastName, String email, String password, String workLocation,
			String department, LocalDate joinDate, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.workLocation = workLocation;
		this.department = department;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	
}
