package tester;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Book;

import custom_exception.LibraryHandlingException;

import static utils.IOUtils.*;

public class LibManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name to restore the data");
			String fileName = sc.nextLine();
			// restore data
			Map<String, Book> library = restoreBookDetails(fileName);
			// display map
//			
//			//store books
//			storeBookDetails(fileName, library);
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Display All Books 2. Remove a book 100. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Lib contains ");
						for(Book b : library.values())
							System.out.println(b);

						break;
					case 2: //remove a book
						System.out.println("Enter book title");
						Book removedBook=library.remove(sc.next());
						if(removedBook == null)
							throw new LibraryHandlingException("Invalid Book title !!!! , Can't remove a book !");
						System.out.println("Book removed : "+removedBook);
						break;

					case 100:
						exit = true;
						storeBookDetails(fileName, library);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
