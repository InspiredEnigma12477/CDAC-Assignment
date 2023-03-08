package pojos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

	@Column(name = "first_name", length = 20)
	private String firstName;
	@Column(name = "last_name", length = 30) // varchar(30)
	private String lastName;
	@Column(length = 30, unique = true) // add unique constraint
	private String email;
	@Column(length = 20, nullable = false) // NOT NULL constraint
	private String password;
	// uni dir many to many relationship between entities : User *---->* Role
	@ManyToMany  (fetch = FetchType.EAGER)  //@ManyToMany : mandatory , o.w MappingExc
	//Since size of many is at the most 3 here (3 roles) , using fetch type as EAGER
	//annotation below : optional BUT reco for customizing names of the link table n it's cols
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();// AS per Gavin King's suggestion , init collection to empty one.
	//uni dir asso between Entity n value type : User 1---->1 Passport
	@Embedded //optional BUT rec for understanding!
	private Passport passport;
	//uni dir one to many asso between Entity n Basic Value type
	@ElementCollection //to indicate collection of value types
	@CollectionTable(name = "user_hobbies",joinColumns = @JoinColumn(name="user_id"))
	@Column(name="hobby",length = 20)
	private List<String> hobbies=new ArrayList<>();
	//uni dir one to many asso between Entity n Composite Value Type
	@ElementCollection //to indicate collection of value types
	@CollectionTable(name = "user_cards",joinColumns = @JoinColumn(name="u_id"))
	private List<Card> cards=new ArrayList<>();

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	//as per Gavin King's reco : add helper(convenience) methods to add a role n remove role
	//optional BUT reco !
	public void addRole(Role role)
	{
		roles.add(role);
	}
	public void removeRole(Role role)
	{
		roles.remove(role);
	}
	

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "User ID " + getId() + " firstName=" + firstName + ", lastName=" + lastName + ", email=" + email;
	}

}
