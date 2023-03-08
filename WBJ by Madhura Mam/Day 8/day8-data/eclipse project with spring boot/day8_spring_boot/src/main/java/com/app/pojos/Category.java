package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * 2. Category : id,  categoryName ,description +
private List<Product> products=new ArrayList<>();//as per Gavin King's suggestion : DO NOT keep collection based null
 */
@Entity
@Table(name="categories")
public class Category extends BaseEntity {
	@Column(name="category_name",length = 30,unique = true)
	private String categoryName;
	@Column(length = 300)
	private String description;
	// one to many : bi dir Category 1--->* Product
	//Category -- one , parent , inverse(since no FK mapping)
	@OneToMany(mappedBy = "productCategory",
			cascade = CascadeType.ALL, orphanRemoval = true/* ,fetch = FetchType.EAGER */)
	private List<Product> products = new ArrayList<>();// init to empty list

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryName, String description) {
		super();
		this.categoryName = categoryName;
		this.description = description;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	// Founder's suggestion : NEVER add asso properties toString --o.w may cause
	// recursion!

	@Override
	public String toString() {
		return "Category ID " + getId() + " [categoryName=" + categoryName + ", description=" + description + "]";
	}
	//add a method(convenience/helper) to establish a bi dir asso. between entities
	public void addProduct(Product p)
	{
		//parent --> child
		products.add(p);
		//child --> parent
		p.setProductCategory(this);
	}
	//add a method(convenience/helper) to remove a bi dir asso. between entities
		public void removeProduct(Product p)
		{
			//parent ----X---> child
			products.remove(p);
			//child ----X----> parent
			p.setProductCategory(null);
			
			
		}

}
