package com.tester;

import java.sql.Connection;
import java.util.Scanner;

import com.util.DbUtil;

public class TestUpdateBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection con=DbUtil.getConnectedToDb();
			//menu 1:show al lbooks
			DbUtil.showAllBooks();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter BookId Title Author Price");
			int bookid=sc.nextInt();
			String name=sc.next();
			String author=sc.next();
			double price=sc.nextDouble();
		
		int i=	DbUtil.updateBook(bookid, name, author, price);
			if(i>0)
			{
				System.out.println("updated....");
			}
			else
			{
				System.out.println("Not Found....");
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
