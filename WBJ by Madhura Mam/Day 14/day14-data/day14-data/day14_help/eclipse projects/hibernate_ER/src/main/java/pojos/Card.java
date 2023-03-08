package pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Card {
	@Column(name="card_number",unique = true,length = 30)
	private String cardNumber;
	@Column(name="exp_date")
	private LocalDate expDate;
	@Column(length = 10)
	private String cvv;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private CardType type;
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(String cardNumber, LocalDate expDate, String cvv, CardType type) {
		super();
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cvv = cvv;
		this.type = type;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public CardType getType() {
		return type;
	}
	public void setType(CardType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", expDate=" + expDate + ", cvv=" + cvv + ", type=" + type + "]";
	}

	
}
