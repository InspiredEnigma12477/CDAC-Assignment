package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.banking.BankAccount;

public class IOUtils {
//add a static method to store sorted data in the text file
	public static void storeAcctDetails(List<BankAccount> accts, String fileName) throws IOException {
		// Java App -->PW ---> FileWriter-----> Text File
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			for(BankAccount a : accts)
				pw.println(a);
		}
	}
}
