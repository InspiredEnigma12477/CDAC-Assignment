package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import com.app.banking.AcctType;
import com.app.banking.BankAccount;

public class IOUtils {
//add a static method to write bank acct details to bin file using rdy made conversion strm n buffering
	public static void writeAcctDetails(String fileName, BankAccount acct) throws IOException {
		// JA ---> DOS (mixed data strm) ---> bin data strm ---> BOS ---> FOS (bin File)
		try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			// int acctNo, String customerName, double balance, AcctType acType, LocalDate
			// creationDate
			dos.writeInt(acct.getAcctNo());// JA---> int --> DOS --> 4 bytes --> BOS --> upon closing--> file
			// cust name
			dos.writeUTF(acct.getCustomerName());
			// bal
			dos.writeDouble(acct.getBalance());
			// acct type : enum
			dos.writeUTF(acct.getAcType().toString());
			// cr date
			dos.writeUTF(acct.getCreationDate().toString());

		}
	}

	// add a static method to restore / read acct details from bin file in a buf
	// manner using conversion strm
	public static BankAccount readAcctDetails(String fileName) throws IOException {
		// 1 . Validate file
		File f1 = new File(fileName);
		if (f1.isFile() && f1.canRead()) {
			// => valid existing readble file --> cont to strms
			// JA <-----DIS <----BIS <----FIS(bin file)
			try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(f1)))) {
				// int acctNo, String customerName, double balance, AcctType acType, LocalDate
				// creationDate
				return new BankAccount(in.readInt(), in.readUTF(), 
						in.readDouble(), AcctType.valueOf(in.readUTF()),
						LocalDate.parse(in.readUTF()));
			}

		}
		else
			System.out.println("Invalid file name!");
		return null;
	}
}
