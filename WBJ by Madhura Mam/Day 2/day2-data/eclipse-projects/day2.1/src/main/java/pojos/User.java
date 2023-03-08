package pojos;

import java.time.LocalDate;
import javax.persistence.*;//JPA : Java EE specs

/*
 *  Create a User POJO
Add these Data members
 userId (PK) ,first name , last name,email,password,confirmPassword
 ,role(enum), regAmount;
	 LocalDate/Date regDate;
	 byte[] image;
 */
@Entity // cls level anno to tell Hibernate , following class is an entity ,
//whose life cycle is to be managed !
@Table(name = "users_tbl")
public class User {
	@Id // PK constraint
	// @GeneratedValue //=> auto ID generation
	// --by def . uses the strategy : AUTO --typically uses a table : hibernate_seq
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	// => extra constraint : auto_increment : works well with Mysql
	@Column(name="user_id") //col name
	private Integer userId;
	@Column(name="first_name",length = 20)//varchar(20)
	private String firstName;
	@Column(name="last_name",length = 20)//varchar(20)
	private String lastName;
	@Column(length = 30, unique = true)//=> unique constraint
	private String email;
	@Column(length = 20,nullable = false)//=> NOT NULL 
	private String password;
	@Transient //=> skip from persistence : no col generation
	private String confirmPassword;
	@Enumerated(EnumType.STRING)//=> col : varchar => enum const name
	@Column(name="user_role",length = 20)
	private Role userRole;
	@Column(name="reg_amount")
	private double regAmount;
	@Column(name="reg_date")
	private LocalDate regDate;
	@Lob //=> col type : longblob for Mysql
	private byte[] image;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName, String email, String password, String confirmPassword, Role userRole,
			double regAmount, LocalDate regDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.userRole = userRole;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}
	

	public User(String lastName, double regAmount, LocalDate regDate) {
		super();
		this.lastName = lastName;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Role getUserRole() {
		return userRole;
	}

	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", userRole=" + userRole + ", regAmount=" + regAmount + ", regDate=" + regDate + "]";
	}

}
