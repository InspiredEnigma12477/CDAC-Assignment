package tester;

import java.util.Scanner;
import static utils.DeSerUtils.restoreAccountDetails;

public class TestDeSerialization {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name for restoring data");
			System.out.println(restoreAccountDetails(sc.nextLine()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
