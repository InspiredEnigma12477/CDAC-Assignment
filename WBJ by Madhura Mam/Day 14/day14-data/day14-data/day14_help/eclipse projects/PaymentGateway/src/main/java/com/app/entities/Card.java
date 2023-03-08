package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cards")
@ToString
public class Card {
	@Id
	//assigned id
	private String cardNo;
	private String customerName;
	private LocalDate expiryDate;
	private String cvv;
	private double balance;
}
