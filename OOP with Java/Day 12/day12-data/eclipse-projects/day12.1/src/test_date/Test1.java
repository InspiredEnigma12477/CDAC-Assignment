package test_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// display curnt date : LocalDate
		System.out.println("Current date " + LocalDate.now());
		// curnt time
		System.out.println("Current time " + LocalTime.now());
		// curnt date n time (time stamp)
		System.out.println("Curnt time stamp " + LocalDateTime.now());

	}

}
