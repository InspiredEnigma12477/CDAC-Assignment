package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adr_tbl")
public class Address extends BaseEntity {
	// Address details : addrLine1, addrLine2,city,state country,zipCode
	@Column(length = 50, name = "adr_line1")
	private String adrLine1;
	@Column(length = 50, name = "adr_line2")
	private String adrLine2;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length = 20)
	private String country;
	@Column(length = 20)
	private String zipCode;
	// one to one uni dir asso between User <----- Address
	// parent side : User , child : address
	//owning side : Address , inverse side : User
	//Since Address is the owning side , you can instruct hibernate to behave in a lazy manner for one-one , it will obey
	//BUT it DOES NOT obey FetchType.LAZY , if you add it to the non owning side : IMPORTANT
	@OneToOne(fetch = FetchType.LAZY)
	
	@JoinColumn(name = "user_id", nullable = false)
	@MapsId // To tell hibernate , Address wil NOT have a separate PK , it will be shared
			// with users table n it will acts as FK referencing PK of the users table
	private User owner;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String adrLine1, String adrLine2, String city, String state, String country, String zipCode) {
		super();
		this.adrLine1 = adrLine1;
		this.adrLine2 = adrLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String getAdrLine1() {
		return adrLine1;
	}

	public void setAdrLine1(String adrLine1) {
		this.adrLine1 = adrLine1;
	}

	public String getAdrLine2() {
		return adrLine2;
	}

	public void setAdrLine2(String adrLine2) {
		this.adrLine2 = adrLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Address [adrLine1=" + adrLine1 + ", adrLine2=" + adrLine2 + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipCode=" + zipCode + "]";
	}

}
