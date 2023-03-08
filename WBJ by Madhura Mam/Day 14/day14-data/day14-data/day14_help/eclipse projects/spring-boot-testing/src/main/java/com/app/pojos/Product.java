package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NamedQuery(name = "Product.findByPrice", query = "select p from Product p where p.price>?1 order by p.price desc")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	@Column(length = 20, unique = true)
	private String name;
	private double price;
	@Column(name = "expiry")
	private LocalDate expiresOn;

	
	public Product(String name, double price, LocalDate expiresOn) {
		super();

		this.name = name;
		this.price = price;
		this.expiresOn = expiresOn;
	}

	
}
