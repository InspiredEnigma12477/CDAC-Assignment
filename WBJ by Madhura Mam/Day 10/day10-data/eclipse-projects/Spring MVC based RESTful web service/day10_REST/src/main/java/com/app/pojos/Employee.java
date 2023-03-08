package com.app.pojos;
/*
 * <tr key={employee.id}>
                <td>{employee.firstName}</td>
                <td>{employee.lastName}</td>
                <td>{employee.email}</td>
                <td>{employee.workLocation}</td>
                <td>{employee.department}</td>
                <td>{employee.joinDate}</td>
                <td>{employee.salary}</td>
                <td>
 */

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//JPA annotations
@Entity
@Table(name="new_emps")
//Lombok annotations
@NoArgsConstructor //=def arg less ctor
//@AllArgsConstructor //all args ctor
@Getter //all getters
@Setter //all setters
//@Data// all getters + setters + hashCode + equals + toString
@ToString(exclude = "password")//toString excluding password
public class Employee extends BaseEntity {
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column(length = 30,unique = true)
	private String email;
	@Column(length = 20,nullable = false)
	private String password;
	private String location;
	private LocalDate joinDate;
	private double salary;
	public Employee(String firstName, String lastName, String email, String password, String location,
			LocalDate joinDate, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.location = location;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	
	
}
