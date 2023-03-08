package pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//id | name    | email          | password | reg_amt | reg_date   | role 

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String password;
	@Column(name = "reg_amt")
	private double depositAmt;
	@Temporal(TemporalType.DATE)
	@Column(name = "reg_date")
	private Date regDate;
	private String role;

	public Customer() {
		System.out.println("in cust constr...");
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public double getDepositAmt() {
		return this.depositAmt;
	}

	public void setDepositAmt(double depositAmt) {
		this.depositAmt = depositAmt;
	}

	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Column(length = 20)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", depositAmt=" + depositAmt + ", email=" + email + ", name=" + name
				+ ", password=" + password + ", regDate=" + regDate + ", role=" + role + "]";
	}

}