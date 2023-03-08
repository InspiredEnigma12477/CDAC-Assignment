package com.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.DbUtil;

public class TestInsertBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//connection
			try {
			Connection con=DbUtil.getConnectedToDb();
			//menu 1:show al lbooks
			DbUtil.showAllBooks();
			//menu 2:add new book
			//insert into books vales(10,'BlackBook','Xyz',1000);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter BookId Title Author Price");
			int bookid=sc.nextInt();
			String name=sc.next();
			String author=sc.next();
			double price=sc.nextDouble();
			
			//
			String sqlInsert="insert into books values(?,?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(sqlInsert);
			
			//insert,update,delete:Write operations on DB
			//assign values to parameter
			pstmt.setInt(1, bookid);//first parameter 
			pstmt.setString(2, name);//second parameter
			pstmt.setString(3, author);//third parameter
			pstmt.setDouble(4, price);//first parameter 
			int i=pstmt.executeUpdate();
			
			System.out.println(i+ " Row Insrted....");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
