package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TestBufFileRead {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <----BR <--- FR <--- text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			System.out.println("File contents ");
			String s=null;
			while((s=br.readLine())!= null)
				System.out.println(s);
			System.out.println("Data read over !!!!!!!!!!!!!!!!!!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over......");

	}

}
