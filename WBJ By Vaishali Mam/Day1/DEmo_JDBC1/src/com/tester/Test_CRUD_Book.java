package com.tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dal.BookDALImpl;
import com.pojo.Book;
import com.util.DBUtil;

public class Test_CRUD_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DBUtil.openConnection();

			System.out.println("1:Show All Books 2: Add New  3:Update Book 4:Delete Book");

			BookDALImpl bookDal = new BookDALImpl();

			int ch = 0;
			;
			Scanner sc = new Scanner(System.in);

			do {
				System.out.println("Enter Choice:");
				ch = sc.nextInt();
				switch (ch) {
				case 1:

					List<Book> list = bookDal.getallBooks();
					list.forEach(b -> System.out.println(b));

					break;
				case 2:
					System.out.println("Enter BookId Title Author Price:");
					Book dto=new Book(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
					int i=bookDal.addBook(dto);
					if(i>0)
					{
						System.out.println("Inserted");
					}
					break;
				case 3:
					System.out.println("Edit : BookId NewTitle NewAuthor NewPrice:");
					 dto=new Book(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
					  i=bookDal.updateBook(dto);
					if(i>0)
					{
						System.out.println("Updated");
					}
					break;
				case 4:System.out.println("Enter BookId To Delete");
				int id=sc.nextInt();
				i=bookDal.deleteBook(id);
				if(i>0)
				{
					System.out.println("Deleted");
				}
				else
				{
					System.out.println("Not Found...");
				}
				}

			} while (ch != 5);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
