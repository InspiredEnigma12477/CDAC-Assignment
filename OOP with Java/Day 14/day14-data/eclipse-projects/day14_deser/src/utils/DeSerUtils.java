package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerUtils {
//write a method to de-serialize bin stream
	public static Object restoreAccountDetails(String fileName) throws IOException, ClassNotFoundException {
		// validate file
		File path = new File(fileName);
		if (path.isFile() && path.canRead()) {
			// Java App <--- OIS (de -ser) <----- FIS (bin file)
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
				// de serial
				return in.readObject();//JVM : 
			}
		}
		System.out.println("Invalid file name!!!!!!!!!!!1");
		return null;
	}
}
