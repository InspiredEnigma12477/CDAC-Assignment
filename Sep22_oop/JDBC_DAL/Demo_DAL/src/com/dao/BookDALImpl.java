package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dal.IBookDAL;
import com.pojo.Book;
import com.util.DbUtil;

public class BookDALImpl implements IBookDAL {
	private Connection con;
	private PreparedStatement pstmt1, pstmt2, pstmt3;

//use constr for con
	public BookDALImpl() throws ClassNotFoundException, SQLException {
		System.out.println("---BookDalImpl--constr--invoked---");
		// connection:get con obj from DbUtil
		con = DbUtil.getConnectedToDb();

		pstmt1 = con.prepareStatement("insert into books values(?,?,?,?)");
		pstmt2 = con.prepareStatement("update books set title=?,author=?,price=? where bookid=?");
		pstmt3 = con.prepareStatement("select * from books where bookid=?");
	}

	@Override
	public List<Book> getAllBooks() {

		List<Book> allBooks = new ArrayList<Book>();
		// select * from books
		String sql = "select * from books";
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(sql);// from db in resultSet ---->AL
			while (rset.next()) {
				allBooks.add(new Book(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getDouble(4)));
			}

			rset.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allBooks;

	}

	@Override
	public String addBook(Book obj) {

		try {
			// add first parameter to pstmt1
			pstmt1.setInt(1, obj.getBookId());
			// add second parameter
			pstmt1.setString(2, obj.getTitle());
			// add second parameter
			pstmt1.setString(3, obj.getAuthor());
			// add second parameter
			pstmt1.setDouble(4, obj.getPrice());

			// fire query
			// insert,update delete:write operation on db
			// executeUpdate
			int i = pstmt1.executeUpdate();
			if (i > 0)
				return " Inserted:";
			else
				return null;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Book getBookById(int bookid) {

		try {
			pstmt3.setInt(1, bookid);

			ResultSet rset = pstmt3.executeQuery();
			if (rset.next()) {
				return new Book(rset.getInt("bookId"), rset.getString("title"), rset.getString("author"),
						rset.getDouble("price"));
			} else
				return null;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public void cleanUp() throws SQLException {
		pstmt1.close();
		pstmt2.close();
		pstmt2.close();
		pstmt2.close();
		con.close();

		System.out.println("---cleanup done----");
	}

	@Override
	public String updateBook(Book obj) throws SQLException {

		CallableStatement cstmt = con.prepareCall("call UpdateBook(?,?,?,?)");
		cstmt.setInt(1, obj.getBookId());
		cstmt.setString(2, obj.getTitle());
		cstmt.setString(3, obj.getAuthor());
		cstmt.setDouble(4, obj.getPrice());

		int i=cstmt.executeUpdate();
		if(i>0)
			return "Updated:";
		else return null;
		 
	}

}
