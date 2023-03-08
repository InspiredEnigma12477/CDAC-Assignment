package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="products")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"expDate","productCategory"} )
public class Product extends BaseEntity {
//productId, name ,price,description,inStock
	@Column(name="product_name",length = 20,unique = true)
	private String productName;
	private double price;
	@Column(length = 100)
	private String description;
	@Column(name="in_stock")
	private boolean inStock;
	@Transient
	private LocalDate expDate;
	//many-to-one association with Category
	@ManyToOne
	@JoinColumn(name="category_id",nullable = false) //to specify FK col name
	private Category productCategory;
	
	public Product(String productName , double price, String description, LocalDate expDate) {
		super();
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.expDate = expDate;
		this.inStock=true;
	}
		
}
