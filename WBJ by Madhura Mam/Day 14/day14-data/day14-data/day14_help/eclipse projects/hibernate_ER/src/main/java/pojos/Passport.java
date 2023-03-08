package pojos;
//Data members : passport number , creation date , location, expiry date ,issuing  country 

import java.time.LocalDate;
import javax.persistence.*;

@Embeddable //mandatory : to tell hib following is the embeddable value object(composite UDT)
//Wil NOT have standalone existence , will be depedent upon owning entity
//Imposes : stronger form of asso : composition
public class Passport {
	@Column(name="passport_number",length = 30)
	private String passportNumber;
	@Column(name="creation_date")
	private LocalDate creationDate;
	@Column(length = 30)
	private String location;
	@Column(name="exp_date")
	private LocalDate expDate;
	@Column(name="country",length = 30)
	private String issuingCountry;

	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public Passport(String passportNumber, LocalDate creationDate, String location, LocalDate expDate,
			String issuingCountry) {
		super();
		this.passportNumber = passportNumber;
		this.creationDate = creationDate;
		this.location = location;
		this.expDate = expDate;
		this.issuingCountry = issuingCountry;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public String getIssuingCountry() {
		return issuingCountry;
	}

	public void setIssuingCountry(String issuingCountry) {
		this.issuingCountry = issuingCountry;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", creationDate=" + creationDate + ", location="
				+ location + ", expDate=" + expDate + ", issuingCountry=" + issuingCountry + "]";
	}

}
