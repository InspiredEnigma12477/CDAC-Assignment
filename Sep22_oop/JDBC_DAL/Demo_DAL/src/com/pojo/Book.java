package com.pojo;

public class Book {
// bookid | title     | author    | price
	private int bookId;
	private String title;
	private String author;
	private double price;
	//getters and setters
	//
	public Book() {
		super();
	}
	public Book(int bookId, String title, String author, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	
	//to string
	
}
