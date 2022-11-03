package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestBufFileCopy {

	public static void main(String[] args) {
		System.out.println("Enter src file name n dest file name , on 2 separate lines");
		try (Scanner sc = new Scanner(System.in);
				// Java App <--- BR <---- FR < --- Text File (src)
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				// Java App ---> PW ---> FW --> Text File (dest)
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine(), true));) {
			String line = null;
			while ((line = br.readLine()) != null)
				pw.println(line);

			System.out.println("file copy done !");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
