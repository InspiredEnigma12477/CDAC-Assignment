package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	public static Connection con;

	public static Connection getConnectedToDb() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded....");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac22", "root", "root123");
		System.out.println("Connected To DB.....");
		return con;
	}

	public static void showAllBooks() throws SQLException {

		String sql = "select * from books";
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery(sql);
		while (rset.next()) {

			System.out.printf("%d %s  %s  %.1f", rset.getInt(1), rset.getString(2), rset.getString(3),
					rset.getDouble(4));
			System.out.println();
		}

		rset.close();

	}


public static int insertBook(int bookid,String title,String author,double price) throws SQLException
{
	String sqlInsert="insert into books values(?,?,?,?)";
	
	PreparedStatement pstmt=con.prepareStatement(sqlInsert);
	
	//insert,update,delete:Write operations on DB
	//assign values to parameter
	pstmt.setString(2, title);//second parameter
	pstmt.setString(3, author);//third parameter
	pstmt.setInt(1, bookid);//first parameter 
	pstmt.setDouble(4, price);//first parameter 
	int i=pstmt.executeUpdate();
	
	System.out.println(i+ " Row Insrted....");
	
	return i;
}

public static int updateBook(int bookid,String title,String author,double price) throws SQLException
{
	String sqlInsert="update books set title=?,author=?,price=? where bookid=?";
	
	PreparedStatement pstmt=con.prepareStatement(sqlInsert);
	
	//insert,update,delete:Write operations on DB
	//assign values to parameter
	
	pstmt.setString(1, title);
	pstmt.setString(2, author);
	pstmt.setDouble(3, price);
	pstmt.setInt(4, bookid);
	
	int i=pstmt.executeUpdate();
	
	System.out.println(i+ " Row Update....");
	return i;
}




}
