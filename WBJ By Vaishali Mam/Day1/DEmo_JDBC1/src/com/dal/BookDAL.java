package com.dal;

import java.util.List;

import com.pojo.Book;

public interface BookDAL {

	//CRUD
	//select * from book;
	List<Book> getallBooks();
	//add new book
	int addBook(Book obj);
	
	//update
	int updateBook(Book obj);
	//delete book
	
	int deleteBook(int id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
