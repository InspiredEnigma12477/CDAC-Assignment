package com.pojo;

public class Book {
	//this is pojo:DTO
	// bookid | title     | author | price
	private int bookid;
	
	private String title;
	
	private String author;
	private double price;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int bookid, String title, String author, double price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	

}
