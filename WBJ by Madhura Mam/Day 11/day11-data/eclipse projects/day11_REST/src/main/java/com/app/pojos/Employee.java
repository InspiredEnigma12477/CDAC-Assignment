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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

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
@AllArgsConstructor //all args ctor
@Getter //all getters
@Setter //all setters
//@Data// all getters + setters + hashCode + equals + toString
@ToString(exclude = "password")//toString excluding password
//how to exclude null or blank(default) values during ser ?
//@JsonInclude(Include.NON_DEFAULT)
public class Employee extends BaseEntity {
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column(length = 30,unique = true)
	private String email;
	@Column(length = 20,nullable = false)
	//How to tell Jackson (i.e a vendor for ser n deserial) to skip the property
	//from ser yet retain during de-ser ? 
	@JsonProperty(access = Access.WRITE_ONLY) // only setter will be accessible during conversion
	//Jackson uses : getters : during ser. n setters during de-ser.
	private String password;
	private String department;
	private String location;
	private LocalDate joinDate;
	private double salary;
	//name based ctor
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
