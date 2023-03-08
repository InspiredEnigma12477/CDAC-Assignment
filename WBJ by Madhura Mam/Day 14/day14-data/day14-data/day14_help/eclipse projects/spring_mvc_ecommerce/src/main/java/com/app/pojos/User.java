package com.app.pojos;
/*
 * userId (PK) ,first name,last name , email,password,confirmPassword,role(enum), regAmount;
	 LocalDate/Date regDate;
	 byte[] image;
 */

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
//will be importing all annotations from this pkg
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity // mandatory cls level annotation meant for hibernate , to tell following is the
		// entity class , to be managed by hib frmwork
@Table(name = "users_tbl") // optional anno , meant to supply table name
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = { "cart", "card", "hobbies" })
public class User extends BaseEntity {
	
	@Length(min=4,max=20,message = "Invalid or Blank first name!!!!!!")
	@Column(name = "first_name", length = 20) // col name , varchar size : 20
	private String firstName;
	@Column(name = "last_name", length = 20) // col name , varchar size : 20
	@NotBlank(message = "Last  name can't be blank")
	private String lastName;
	@Column(length = 25, unique = true) // unique constraint
	private String email;
	@Column(length = 20, nullable = false) // non null constraint
	private String password;
	@Enumerated(EnumType.STRING) // col type : varchar (enum const name)
	@Column(name = "user_role", length = 30)
	private Role userRole;
	// User(Customer) HAS-A Cart User 1---->1 Cart
	@OneToOne(mappedBy = "cartOwner", cascade = CascadeType.ALL, orphanRemoval = true)
	private ShoppingCart cart;
	// User HAS-A AdharCard (one-to-one asso between entity n embeddable)
	@Embedded // OPTIONAL anno. simply added for understanding!
	@Valid //added for cascading the validations to the embeddable
	private AdharCard card;
	// User HAS-A hobbies : (one-to-many asso between entity n basic value type)
	@ElementCollection // mandatory anno to tell hib , this propert is a collection of either basic
						// value type OR embeddables
	@CollectionTable(name = "hobbies", joinColumns = @JoinColumn(name = "user_id", nullable = false))
	@Column(name = "hobby_name", length = 50)
	private List<String> hobbies = new ArrayList<>();

	public User(String firstName, String lastName, String email, String password, Role userRole) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userRole = userRole;
	}

	// helper method : to add cart
	public void addCart(ShoppingCart cart) {
		this.cart = cart;
		cart.setCartOwner(this);// bi dir asso done !
	}

}
