package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Book;
import com.util.DBUtil;

public class BookDALImpl implements BookDAL {

	private Connection con;
	private Statement stmt;
	private ResultSet rset;
	private PreparedStatement pstmt1,pstmt2,pstmt3;
	
	public BookDALImpl() throws SQLException
	{
		con=DBUtil.getCon();
		
		//create statement for static sql
		stmt=con.createStatement();
		System.out.println("--statement crated for static sql---");
		
		pstmt1=con.prepareStatement("insert into books values(?,?,?,?)");
		pstmt2=con.prepareStatement("update books set title=? ,author=? ,price=? where bookid=?");
		pstmt3=con.prepareStatement("delete from  books  where bookid=?");
		
		System.out.println("--p statement crated for dynamic sql---");
		
		System.out.println("---bookDal created---");
		
	}
	
	@Override
	public List<Book> getallBooks() {
	//select * from book;
	try {
		List<Book> allBooks=new ArrayList<Book>();
		
		//stmt.executeQuery: read data: select query
		rset= stmt.executeQuery("select * from books");
		while(rset.next())
		{
			allBooks.add(new Book(rset.getInt("bookid"),
					rset.getString("title"),
					rset.getString("author"),
					rset.getDouble("price")));
		}
		return allBooks;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
		
		
		return null;
	}

	@Override
	public int addBook(Book obj) {
		//insert into books values(?,?,?,?);		
		 
		try {
			//add 1st  parameter to pstmt1 :bookid 
			pstmt1.setInt(1, obj.getBookid());
			//add 2  parameter to pstmt1 :title
			pstmt1.setString(2, obj.getTitle());
			
			pstmt1.setString(3, obj.getAuthor());
			
			pstmt1.setDouble(4, obj.getPrice());
			//execute statment on db 
			
			int i=pstmt1.executeUpdate();//Write: Insert ,Update Delete
			System.out.println("---inserted obj:"+obj);
			return i;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int updateBook(Book obj) {
		
		//update books set title=? ,author=? ,price=? where bookid=?
		try {
			//add 1st  parameter to pstmt1 : 
			pstmt2.setString(1, obj.getTitle());
			//add 2  parameter to pstmt1 :
			pstmt2.setString(2, obj.getAuthor());
					 		
			pstmt2.setDouble(3, obj.getPrice());
			pstmt2.setInt(4, obj.getBookid());
			//execute statment on db 
			
			int i=pstmt2.executeUpdate();//Write: Insert ,Update Delete
			System.out.println("---updated obj:"+obj);
			return i;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteBook(int id) {
		// TODO Auto-generated method stub
		//delete from  books  where bookid=?
		try {
			pstmt3.setInt(1, id);
			int i=pstmt3.executeUpdate();
			return i;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	

}
