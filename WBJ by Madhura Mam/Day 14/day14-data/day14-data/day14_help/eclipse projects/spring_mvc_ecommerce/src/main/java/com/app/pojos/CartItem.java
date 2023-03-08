package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cart_items")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude ="product")
public class CartItem extends BaseEntity {
//quantity , totalPrice , cart , product
	private int quantity;
	@Column(name = "total_price")
	private double totalPrice;
	// Cart 1<---* CartItem
	@ManyToOne
	@JoinColumn(name = "cart_id", nullable = false)
	private ShoppingCart cart;
	// CartItem 1---->1 Product
	@OneToOne
	@JoinColumn(name="product_id")
	private Product product;	
}
