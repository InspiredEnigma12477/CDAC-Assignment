package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.banking.BankAccount;

public class SerDeSerUtils {
//add a static method to store map of accts in  bin file using ser.
	public static void writeAcctsData(String fileName, Map<Integer, BankAccount> acctMap) throws IOException {
		// Java App ---> OOS --> ser bin strm --> FOS (bin file)
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			// write map to bin file
			out.writeObject(acctMap);// JVM is performing ser --->chks serializability of all the nodes in the obj
										// graph --> any time it comes across non ser node --- entire ser is aborted --> java.io.NotSerExc

		}
	}
}
