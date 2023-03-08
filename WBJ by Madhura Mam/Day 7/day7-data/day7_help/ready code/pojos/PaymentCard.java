package pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class PaymentCard {
	@Column(name="card_no",length = 20,unique = true)
	private String cardNo;
	@Column(name="exp_date")
	private LocalDate expDate;
	@Column(length = 5)
	private String cvv;
	@Enumerated(EnumType.STRING)
	@Column(name="card_type",length = 20)
	private CardType cardType;
	public PaymentCard() {
		// TODO Auto-generated constructor stub
	}
	public PaymentCard(String cardNo, LocalDate expDate, String cvv, CardType cardType) {
		super();
		this.cardNo = cardNo;
		this.expDate = expDate;
		this.cvv = cvv;
		this.cardType = cardType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "PaymentCard [cardNo=" + cardNo + ", expDate=" + expDate + ", cvv=" + cvv + ", cardType=" + cardType
				+ "]";
	}
	

}
