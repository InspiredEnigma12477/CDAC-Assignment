package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Book;
import static utils.LibUtils.populateLibrary;

public class IOUtils {
//add a static method to store books details
	public static void storeBookDetails(String fileName, Map<String, Book> books) throws IOException {
		// create ser chain : Java App ---> OOS ---> FOS (bin file name)
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(books);
			System.out.println("Stored book details successfully !");
		}
	}

	// add a static method to ret populated map having sample data : if file doesn't
	// exist
	// o.w : ret the map restored from bin file
	@SuppressWarnings("unchecked")
	public static Map<String, Book> restoreBookDetails(String fileName) throws ClassNotFoundException, IOException {
		// validate file
		File f1 = new File(fileName);
		if (f1.isFile() && f1.canRead()) {
			// attach data strms : Java App <---- OIS <---- FIS (bin file)
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {
				return (Map<String, Book>) in.readObject();//rets map with data from bin file
			}
		}
		//=> no valid file
		System.out.println("invalid file !!!!");
		return populateLibrary();//rets map with sample data
	}
}
